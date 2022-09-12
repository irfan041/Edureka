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

		Certification c1 = new Certification();
		c1.setCname("Java");

		Certification c2 = new Certification();
		c2.setCname("Oracle");

		Set<Certification> cset = new HashSet<Certification>();
		cset.add(c1);
		cset.add(c2);

		Student s1 = new Student();
		s1.setStudent_name("Snehal");
		s1.setCset(cset);

		Student s2 = new Student();
		s2.setStudent_name("Amar");
		s2.setCset(cset);

		Configuration cfg = new Configuration();
		cfg.configure("resource/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		s.save(s1);
		s.save(s2);
		t.commit();
		s.close();
		sf.close();

	}
}
