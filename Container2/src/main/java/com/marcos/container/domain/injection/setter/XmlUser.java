package com.marcos.container.domain.injection.setter;

public class XmlUser {
	
	private String id;
	private String firstName;
	private String lastName;
	private XmlCar car;
	private XMLHouse house;
	
	public XmlUser(){
		System.out.println("inside XML user cons no param");
	}
	
	public XmlUser(XMLHouse house){
		System.out.println("inside XML user cons 1house");
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
		System.out.println("inside XML user setting car");
	}

	public XMLHouse getHouse() {
		return house;
	}

	public void setHouse(XMLHouse house) {
		this.house = house;
	}		
	
	
}
