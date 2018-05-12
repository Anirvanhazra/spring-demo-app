package com.newyou.bydebby.springdemoapp;

//import com.newyou.bydebby.springdemoapp.basic.ServiceProperties;
import com.newyou.bydebby.springdemoapp.properties.SpringServiceProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Configuration
@PropertySource("classpath:app.properties")
public class SpringDemoPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoPropertiesApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDemoPropertiesApplication.class);
		SpringServiceProperties serviceProperties = applicationContext.getBean(SpringServiceProperties.class);
		//BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		LOGGER.info("External Url --> {}", serviceProperties.getExternalUrl());
		//applicationContext.close();
	}
}
