package com.marcos.container.domain.injection.constructor;

public class XmlUser {
	
	private String id;
	private String firstName;
	private String lastName;
	private XmlCar car;
	private XMLHouse house;
	
	public XmlUser(){
		System.out.println("inside user cons no param");
	}
	
	public XmlUser(XmlCar car){
		System.out.println("inside user cons 1car");
		this.car = car;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public XmlCar getCar() {
		return car;
	}

	public void setCar(XmlCar car) {
		this.car = car;
	}

	public XMLHouse getHouse() {
		return house;
	}

	public void setHouse(XMLHouse house) {
		this.house = house;
	}		
	
	
}
