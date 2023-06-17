package com.collectionTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/collectionTypes/collectionconfig.xml");
     Employee employee1=(Employee)context.getBean("employee1");
     System.out.println(employee1.getEmployeeId());
     System.out.println(employee1.getEmployeeNames());
     System.out.println(employee1.getEmployeeAddresses());
     System.out.println(employee1.getCourses());
     
     System.out.println();
     Employee employee2=(Employee)context.getBean("employee2");
     System.out.println(employee2.getEmployeeId());
     System.out.println(employee2.getEmployeeNames());
     System.out.println(employee2.getEmployeeAddresses());
     System.out.println(employee2.getCourses());
	}

}

