package com.marcos.container.domain.injection.setter;

public class XmlCar {

	private String model;
	private String owner;
	
	public XmlCar(){
		System.out.println("inside XML car cons no param");
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}	
	
}
