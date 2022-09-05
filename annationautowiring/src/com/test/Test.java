package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/resource/applicationcontext.xml");
		Employee emp=(Employee) context.getBean("empbean");
		emp.getEmployeeDetails();

	}

}
