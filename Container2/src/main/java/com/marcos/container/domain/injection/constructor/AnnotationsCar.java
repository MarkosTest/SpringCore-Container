package com.marcos.container.domain.injection.constructor;

import org.springframework.stereotype.Component;

@Component(value="carBeanAnnotation")
public class AnnotationsCar {

	private String model;
	private String owner;
	
	public AnnotationsCar(){
		System.out.println("inside ANNOTATIONS car cons no param");
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
