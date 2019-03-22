package com.baosian.config;


//this file contains information about database and hibernate properties

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.baosian.repositories")
@PropertySource(value = {"classpath:application.properties"})
public class HibernateConfig {
    @Autowired
    private Environment environment;

    /*      Start Spring JPA config details     */

}
