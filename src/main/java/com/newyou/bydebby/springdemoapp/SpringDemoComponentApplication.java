package com.newyou.bydebby.springdemoapp;

import com.newyou.bydebby.springcomponentdemo.component.ComponentDAO;
import com.newyou.bydebby.springdemoapp.scope.EmployeeDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.newyou.bydebby.springcomponentdemo.component")
public class SpringDemoComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDemoComponentApplication.class, args);
		ComponentDAO employeeDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO employeeDAO1 = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",employeeDAO);
		LOGGER.info("{}",employeeDAO.getJdbcconn());

		LOGGER.info("{}",employeeDAO1);
		LOGGER.info("{}",employeeDAO1.getJdbcconn());

	}
}
