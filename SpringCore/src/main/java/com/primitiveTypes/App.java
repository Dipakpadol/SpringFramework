package com.primitiveTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello World ! I am coming with fully power and strength");
         ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         
         Student student1=(Student)context.getBean("student1");
         System.out.println(student1);
         
         Student student2=(Student)context.getBean("student2");
         System.out.println(student2);
         
         Teacher teacher1=(Teacher)context.getBean("teacher1");
         System.out.println(teacher1);
         
         Teacher teacher2=(Teacher)context.getBean("teacher2");
         System.out.println(teacher2);
	}

}
