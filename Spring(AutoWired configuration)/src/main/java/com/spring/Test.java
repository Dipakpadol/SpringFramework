package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context1=new ClassPathXmlApplicationContext("Spring.xml");
		
		Bike obj1=(Bike)context1.getBean("bike");
		obj1.drive();
	
        Car obj2=(Car)context1.getBean("car");
		obj2.drive();
//		
//		Vehicle obj3=(Vehicle)context1.getBean("vehicle");
//		obj3.drive();
		
//		 Tyres obj4=(Tyres)context1.getBean("tyre");
  //      		System.out.println(obj4);

	}

}
