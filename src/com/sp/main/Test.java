package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/resources/applicationContext.xml");
		
		Student std =(Student) context.getBean("stdObj2");
		
		std.display();
		
	 
		
	
	
	}
	
}
