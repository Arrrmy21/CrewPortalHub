package com.oleksii.arrmy.CrewPortal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = { "com.oleksii.arrmy.CrewPortal.controller"} )
public class WebConfig implements WebMvcConfigurer {

}
