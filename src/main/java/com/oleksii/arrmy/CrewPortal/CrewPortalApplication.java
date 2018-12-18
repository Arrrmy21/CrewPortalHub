package com.oleksii.arrmy.CrewPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrewPortalApplication {

	public static void main(String[] args){
		SpringApplication.run(CrewPortalApplication.class, args);

	}
}
