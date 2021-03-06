package com.oleksii.arrmy.CrewPortal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {@ComponentScan("com.oleksii.arrmy.CrewPortal.service"),
        @ComponentScan("com.oleksii.arrmy.CrewPortal.dao")})
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {

        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

        Properties properties = new Properties();

        properties.put(DRIVER, env.getProperty("db.driver"));
        properties.put(URL, env.getProperty("db.url"));
        properties.put(USER, env.getProperty("db.user"));
        properties.put(PASS, env.getProperty("db.password"));

        properties.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
        properties.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

        // Setting C3P0 properties
        properties.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
        properties.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
        properties.put(C3P0_ACQUIRE_INCREMENT,
                env.getProperty("hibernate.c3p0.acquire_increment"));
        properties.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
        properties.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));

        properties.put(NON_CONTEXTUAL_LOB_CREATION, true);
        properties.put(DIALECT, env.getProperty("spring.jpa.database-platform"));

        properties.put("hibernate.cache.use_second_level_cache", true);
        properties.put("hibernate.cache.use_query_cache", true);
        properties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
        properties.put("hibernate.cache.provider_configuration_file_resource_path", "ehcache.xml");

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
