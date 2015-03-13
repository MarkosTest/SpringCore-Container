package com.marcos.container.domain.injection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="userBeanAnnotation")
public class AnnotationsUser {
	
	private String id;
	private String firstName = "Marcos";
	private String lastName;
	private AnnotationsCar car;
	private AnnotationsHouse house;
	
	public AnnotationsUser(){
		System.out.println("inside ANNOTATIONS user cons no param");
	}
	
	/**@Autowired(required=false)
	public AnnotationsUser(@Qualifier("carBeanAnnotation") AnnotationsCar car){
		System.out.println("inside ANNOTATIONS user cons 1car");
		this.car = car;
	}**/
	
	@Autowired(required=false)
	public AnnotationsUser(@Qualifier("houseBeanAnnotation") AnnotationsHouse house, String ss){
		System.out.println("inside ANNOTATIONS user cons 1house");
		this.house = house;
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

	public AnnotationsCar getCar() {
		return car;
	}

	public void setCar(AnnotationsCar car) {
		this.car = car;
	}

	public AnnotationsHouse getHouse() {
		return house;
	}

	public void setHouse(AnnotationsHouse house) {
		this.house = house;
	}		
	
	
}
