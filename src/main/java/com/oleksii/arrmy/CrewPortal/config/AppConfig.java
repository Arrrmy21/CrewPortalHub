package com.oleksii.arrmy.CrewPortal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

import static org.hibernate.cfg.AvailableSettings.*;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {@ComponentScan( "com.oleksii.arrmy.CrewPortal.service"),
        @ComponentScan( "com.oleksii.arrmy.CrewPortal.dao") })
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory(){

        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

        Properties properties = new Properties();

        properties.put(DRIVER, env.getProperty("DB.driver"));
        properties.put(URL, env.getProperty("DB.url"));
        properties.put(USER, env.getProperty("DB.user"));
        properties.put(PASS, env.getProperty("DB.password"));

//        properties.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
//        properties.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

        factoryBean.setHibernateProperties(properties);
        factoryBean.setPackagesToScan("com.oleksii.arrmy.CrewPortal.model");

        return factoryBean;
    }

    @Bean
        public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
}
