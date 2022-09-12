package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class ClientInsert {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		System.out.println("Hello");
		cfg.configure("resources/oracle.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		OldStudent st = new OldStudent("113", "dabc", "eabc@gmail.com", "Pune");
		OldStudent st1 = new OldStudent("114", "txyz", "hxyz@gmail.com", "Bangalore");
		OldStudent st2 = new OldStudent("115", "ypqr", "mpqr@gmail.com", "HYD");
		s.save(st);
		s.save(st1);
		s.save(st2);
		t.commit();
		s.close();
		sf.close();
		System.out.println("Data Inserted Successfully");

	}

}
