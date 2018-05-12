package com.newyou.bydebby.springdemoapp;

import com.newyou.bydebby.springdemoapp.scope.EmployeeDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDemoScopeApplication.class, args);
		EmployeeDAO employeeDAO = applicationContext.getBean(EmployeeDAO.class);
		EmployeeDAO employeeDAO1 = applicationContext.getBean(EmployeeDAO.class);

		LOGGER.info("{}",employeeDAO);
		LOGGER.info("{}",employeeDAO.getJdbcconn());

		LOGGER.info("{}",employeeDAO1);
		LOGGER.info("{}",employeeDAO1.getJdbcconn());

	}
}
