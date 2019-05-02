package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		
		XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		XmlPersonDAO personDao2 = applicationContext.getBean(XmlPersonDAO.class);
		System.out.println(personDao);
		System.out.println(personDao2);
		System.out.println(personDao.getXmlJdbcConnection());
		}
		
	}

}
