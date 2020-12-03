package soap.example.model;

import java.util.Date;

public class CowModel {
	private long id;
	
	private float weight;
	private int electronic_id;
	private Date birthDate;
	private Date lastDelivery;
	private int delivery_quant;
	
	private static long cowIndex = 0;

	public CowModel(float weight) {
		this.id = cowIndex++;
		this.weight = weight;
	}

	public long getId() {
		return id;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getElectronic_id() {
		return electronic_id;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getLastDelivery() {
		return lastDelivery;
	}

	public void setLastDelivery(Date lastDelivery) {
		this.lastDelivery = lastDelivery;
	}

	public int getDelivery_quant() {
		return delivery_quant;
	}

	public void setDelivery_quant(int delivery_quant) {
		this.delivery_quant = delivery_quant;
	}

	public void setElectronic_id(int electronic_id) {
		this.electronic_id = electronic_id;
	}
}
