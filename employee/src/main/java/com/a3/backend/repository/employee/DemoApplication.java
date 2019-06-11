package com.a3.backend.repository.employee;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		
		String[] beanNames = ctx.getBeanDefinitionNames();
        
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames)
        {
            System.out.println(beanName);
        }
	}
	
	
    
    
//    @Override
//    public void run(String...args) throws Exception {
//
//        System.out.println("DATASOURCE = " + dataSource);
//
//        /// Get dbcp2 datasource settings
//        // BasicDataSource newds = (BasicDataSource) dataSource;
//        // System.out.println("BasicDataSource = " + newds.getInitialSize());
//
//        System.out.println("Display all customers...");
//        List<Employee> list = employeeRepository.findAll();
//        list.forEach(x -> System.out.println(x.getEmployee_id()));
//
//        System.out.println("Done!");
//
//    }

}
