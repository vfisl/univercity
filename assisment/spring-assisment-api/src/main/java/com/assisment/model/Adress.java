package com.assisment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Adress {

 
private String city;
  private String state;
  private String location;
  @Id
	@GeneratedValue(generator = "adress_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "adress_gen",sequenceName = "adress_sequence",initialValue = 1, allocationSize = 1)
  private Integer adressId;
  
  
  public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}


public Adress(String city, String state, String location) {
	super();
	this.city = city;
	this.state = state;
	this.location = location;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public Integer getAdressId() {
	return adressId;
}


public void setAdressId(Integer adressId) {
	this.adressId = adressId;
}


@Override
public String toString() {
	return "Adress [city=" + city + ", state=" + state + ", location=" + location + "]";
}
  
}
