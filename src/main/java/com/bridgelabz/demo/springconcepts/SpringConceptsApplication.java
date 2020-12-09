package com.bridgelabz.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.demo.springconcepts.component.DemoBean;
import com.bridgelabz.demo.springconcepts.component.EmployeeBean;



@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to the Spring Concepts Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.info("Demo Bean = " + demoBean.toString());
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(2);
		employeeBean.setEname("Mayur Zope");
		employeeBean.showEmployeeDetails();
	}
}
