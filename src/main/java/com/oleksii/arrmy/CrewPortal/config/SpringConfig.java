package com.oleksii.arrmy.CrewPortal.config;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Worker getWorker(){
        return new Worker("Alex", 10);
    }
}
