package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		Car c=new Car();
//		c.drive();
//		
//		Bike b=new Bike();
//		b.drive();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Vehicle obj1=(Vehicle)context.getBean("Bike");
		obj1.drive();
		
		Vehicle obj2=(Vehicle)context.getBean("Car");
		obj2.drive();
		
		Tyre obj3=(Tyre)context.getBean("Tyre");
		System.out.println(obj3);
		
		Windows obj4=(Windows)context.getBean("Window");
		System.out.println(obj4);

	}

}
