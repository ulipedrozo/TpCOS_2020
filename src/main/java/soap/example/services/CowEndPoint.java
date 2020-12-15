package soap.example.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ar.edu.isistan.springsoap.gen.Cow;
import ar.edu.isistan.springsoap.gen.GetCowByEIDRequest;
import ar.edu.isistan.springsoap.gen.GetCowByEIDResponse;
import ar.edu.isistan.springsoap.gen.Herd;
import ar.edu.isistan.springsoap.gen.SaveCowRequest;
import ar.edu.isistan.springsoap.gen.SaveCowResponse;
import soap.example.model.CowModel;
import soap.example.model.HerdModel;
import soap.example.repositories.CowRepository;
import soap.example.repositories.HerdRepository;
import soap.example.Constants;

@Endpoint
public class CowEndPoint {

	private CowRepository cowRepository;
	
	@Autowired 
	public CowEndPoint(CowRepository cowRepository) {
		this.cowRepository = cowRepository;
	}
	
	@PayloadRoot(namespace =  Constants.NAMESPACE_URI, localPart = "getCowByEIDRequest")
	@ResponsePayload
	public GetCowByEIDResponse getCowByEID(@RequestPayload GetCowByEIDRequest request) {
		int eid = request.getEid().intValue();
		CowModel cow = cowRepository.findCowByEID(eid);
		GetCowByEIDResponse response = new GetCowByEIDResponse();		
		
		if (cow != null) {
			Cow cow_io = new Cow();
			
			cow_io.setId((int) cow.getId());
			cow_io.setWeight(new BigDecimal(cow.getWeight()));
			cow_io.setElectronicId(cow.getElectronic_id());
			
			response.setCow(cow_io);
		}
		
		return response;
	}
	
	@PayloadRoot(namespace =  Constants.NAMESPACE_URI, localPart = "saveCowRequest")
	@ResponsePayload
	public SaveCowResponse SaveCow(@RequestPayload SaveCowRequest request) {
		int eid = request.getElectronicId().intValue();
		Date bd = request.getFechaNacimiento().toGregorianCalendar().getTime();
		Date ld = request.getUltimaFechaParto().toGregorianCalendar().getTime();
		int dq = request.getCantidadPartos().intValue();
		float w = request.getPeso();
		CowModel cow = cowRepository.saveCow(eid, bd, ld, dq, w);
		SaveCowResponse response = new SaveCowResponse();		
		
		if (cow != null) {
			Cow cow_io = new Cow();
			
			cow_io.setId((int) cow.getId());
			cow_io.setWeight(new BigDecimal(cow.getWeight()));
			cow_io.setElectronicId(cow.getElectronic_id());
			
			try {
				cow_io.setBirthday(getXmlGregorianCalendarFromDate(cow.getBirthDate()));
				cow_io.setLastDelivery(getXmlGregorianCalendarFromDate(cow.getLastDelivery()));
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			response.setCow(cow_io);
		}
		
		return response;
	}
	
	
	private static XMLGregorianCalendar getXmlGregorianCalendarFromDate(final Date date) throws DatatypeConfigurationException{
	    GregorianCalendar calendar = new GregorianCalendar();
	    calendar.setTime(date);
	    return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
	}
	
}
