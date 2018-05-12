package com.newyou.bydebby.springdemoapp;

import com.newyou.bydebby.springdemoapp.basic.ServiceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoBasicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoBasicApplication.class, args);
		ServiceProperties binarySearch = applicationContext.getBean(ServiceProperties.class);
		//BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		//System.out.println(binarySearch1);
		int numbertosearch = binarySearch.binarySearch(new int[]{1,2,6,3}, 4);
		System.out.println(numbertosearch);

		applicationContext.close();
	}
}
