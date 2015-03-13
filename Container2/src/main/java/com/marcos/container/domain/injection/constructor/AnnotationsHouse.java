package com.marcos.container.domain.injection.constructor;

import org.springframework.stereotype.Component;

@Component(value="houseBeanAnnotation")
public class AnnotationsHouse {
	
	private String address;
	
	public AnnotationsHouse(){
		System.out.println("inside ANNOTATIONS house cons no param");
	}	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
