package org.marialucia.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name = "userBean")
	public User getUser() {
		return new User();
	}
}
