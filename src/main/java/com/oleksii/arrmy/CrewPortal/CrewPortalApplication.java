package com.oleksii.arrmy.CrewPortal;

import com.oleksii.arrmy.CrewPortal.config.SpringConfig;
import com.oleksii.arrmy.CrewPortal.model.Worker;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication
public class CrewPortalApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CrewPortalApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Worker bean = context.getBean(Worker.class);

		String name = bean.getName();
		System.out.println("name = " + name);

	}
}
