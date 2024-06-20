package org.marialucia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		property();
		
		annotation();
			
	}
	
	public static void property() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-property.xml");
		
		BeanProperty prop = context.getBean("prop", BeanProperty.class);
		
		prop.saluto();
	}
	
	
	public static void annotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		BeanAnnotation b = context.getBean("bean", BeanAnnotation.class);
		
		b.saluto();

	}
}
