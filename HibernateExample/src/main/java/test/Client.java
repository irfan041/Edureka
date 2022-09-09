package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;
import beans.Student;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student st = new Student();
		Employee e=new Employee(101,"Allen");
		st.setId("109");
		st.setName("Black");
		st.setEmail("Black@gmail.com");
		st.setAddress("New York");
		//String pk = (String) s.save(st);
		//s.persist(st);
		s.saveOrUpdate(st);
		s.save(e);
		//System.out.println(pk);
		//System.out.println("Data Inserted Successfully");
		t.commit();
		s.close();
		sf.close();
	System.out.println("Data Inserted Successfully");

	}

}
