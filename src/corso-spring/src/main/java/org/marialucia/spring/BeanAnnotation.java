package org.marialucia.spring;

import org.springframework.stereotype.Component;

@Component(value = "bean")
public class BeanAnnotation {
	
	public void saluto() {
		System.out.println("Ciao sono un bean con Annotation");
	}
}
