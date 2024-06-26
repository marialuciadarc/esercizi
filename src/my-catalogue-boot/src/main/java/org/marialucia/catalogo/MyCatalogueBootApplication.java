package org.marialucia.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.marialucia.catalogo.repository")
public class MyCatalogueBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCatalogueBootApplication.class, args);
	}

}
