package soap.example.repositories;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import soap.example.model.CowModel;

@Component
public class CowRepository {
	
	private static final Map<Long, CowModel> cows = new HashMap<>();
	
	
	@PostConstruct
	public void initData() {
		
		CowModel cow = new CowModel(100f);
		CowModel cow2 = new CowModel(200f);
		CowModel cow3 = new CowModel(300f);
		CowModel cow4 = new CowModel(400f);
		CowModel cow5 = new CowModel(500f);
		
		cow.setElectronic_id(0);
		cow2.setElectronic_id(1);
		cow3.setElectronic_id(2);
		cow4.setElectronic_id(3);
		cow5.setElectronic_id(4);
		
		cows.put(cow.getId(), cow);
		cows.put(cow2.getId(), cow2);
		cows.put(cow3.getId(), cow3);
		cows.put(cow4.getId(), cow4);
		cows.put(cow5.getId(), cow5);
		
	}
	
	public CowModel findCowByEID(int eid) {
		for (Long l : cows.keySet())
			if (cows.get(l).getElectronic_id() == eid)
				return cows.get(l);
		return null;
	}
	
	public CowModel saveCow(int eid, Date birthDate, Date lastDelivery, int deliveryQuant, float w) {
		CowModel c = new CowModel(w);
		c.setBirthDate(birthDate);
		c.setDelivery_quant(deliveryQuant);
		c.setLastDelivery(lastDelivery);
		c.setElectronic_id(eid);
		cows.put(c.getId(), c);
		return c;
	}
	
	public CowModel getCow (Long id) {
		for (Long l : cows.keySet())
			if (cows.get(l).getId() == id)
				return cows.get(l);
		return null;
	}
	
}
