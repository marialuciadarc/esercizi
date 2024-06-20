package org.marialucia.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		config();
	}
	
	
	public static void config() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		User u = context.getBean("userBean", User.class);
		
		System.out.println(u.getUserInfo());
	}
}
