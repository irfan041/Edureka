package com.java;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String args[]) {
		
		StudentAddress a1 = new StudentAddress();
		a1.setAddress_details("Mumbai");
		
		Student s1 = new Student();
		s1.setStudent_name("Snehal");
		s1.setStudent_address(a1);
		
		
		Student s2 = new Student();
		s2.setStudent_name("Amar");
		s2.setStudent_address(a1);
		
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		a1.setStudents(set);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		


		Session s=sf.openSession();  
	      
	    Transaction t=s.beginTransaction();    
		
	    s.save(a1);
//	    s.save(s1);
//	    s.save(s2);
	    t.commit();
	    s.close();
	    sf.close();

	}
}
