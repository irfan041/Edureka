package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import beans.Laptop;
import beans.Student;

public class TestMain {

	public static void main(String[] args) {

		
		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setStudName("Snehal");
		s1.setMarks(90);

		Laptop l1 = new Laptop();
		l1.setLid(101);
		l1.setLname("Dell");
		l1.setStudent(s1);
		
		s1.setLaptop(l1);
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("resources/oracle.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();    
	    //session.persist(l1);
	    session.persist(s1);
	    t.commit();
	    session.close();
	}

}
