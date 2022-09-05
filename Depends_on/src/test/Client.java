package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import business.Address;
import business.Car;
import business.Employee;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		  Employee e=(Employee)ap.getBean(Employee.class);
		  Address add=e.getAddress();
		  Address add1=e.getAddress();
		  e.setId(101);
		  e.setName("Amit");
		  e.setEmail("Amit@gmail.com");
		  
		 add.setId(102);
		 add.setStreet("sssdgsg");
		 add.setCity("Bangalore");
		 add.setCountry("India");
		 
		  System.out.println(e.getId()+","+e.getName()+","+e.getEmail());
		  System.out.println(add.getId()+","+add.getCity()+","+add.getCountry()+","+add.getStreet());
		  
		 
		  

	}

}
