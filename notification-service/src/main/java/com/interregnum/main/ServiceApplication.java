package com.interregnum.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.interregnum.web.TestController;

@SpringBootApplication
@ComponentScan("com.interregnum")
public class ServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(ServiceApplication.class, args);
		TestController testController = applicationContext.getBean(TestController.class);
		System.out.println("==========");
		System.out.println(testController.testReturn());
		
	}

}
