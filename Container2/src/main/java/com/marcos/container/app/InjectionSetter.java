package com.marcos.container.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marcos.container.domain.injection.setter.AnnotationsUser;

public class InjectionSetter {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
		
	}
}
