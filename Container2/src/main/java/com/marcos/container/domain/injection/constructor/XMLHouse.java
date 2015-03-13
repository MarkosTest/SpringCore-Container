package com.marcos.container.domain.injection.constructor;

public class XMLHouse {
	
	private String address;
	
	public XMLHouse(){
		System.out.println("inside house cons no param");
	}	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
