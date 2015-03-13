package com.marcos.container.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marcos.container.domain.injection.constructor.AnnotationsUser;
import com.marcos.container.domain.injection.constructor.XmlUser;

public class InjectionConstructor {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");
		
		//constructor injection XML
		//XmlUser user = (XmlUser) ctx.getBean("userBean");
		
		//constructor injection annotation
		//AnnotationsUser annotationsUser = (AnnotationsUser) ctx.getBean("userBeanAnnotation");
		
		
	}	
}
