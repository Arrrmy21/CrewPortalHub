package com.oleksii.arrmy.CrewPortal.config;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.oleksii.arrmy.CrewPortal.service", "com.oleksii.arrmy.CrewPortal.dao"})
public class AppConfig {

    @Bean
    public Worker getWorker(){
        return null;
    }

}
