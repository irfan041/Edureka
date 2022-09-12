package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEmployee;

public class Client {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		System.out.println("Hello");
		cfg.configure("resources/oracle.cfg.xml");
		System.out.println("Hello1");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		SEmployee se = new SEmployee(101, "abc", "abc@gmail.com", 50000, "Hibernate");
		HEmployee he = new HEmployee(102, "pqr", "pqr@gmail.com", 60000, 10);
		Admin admin = new Admin(103, "xyz", "xyz@gmail.com", 70000, "BHopal");
		s.save(se);
		s.save(he);
		s.save(admin);
		t.commit();
		s.close();
		sf.close();

	}
}
