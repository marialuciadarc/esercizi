package org.marialucia.spring;

public class BeanProperty {
	private String message;
	
	public void saluto() {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
