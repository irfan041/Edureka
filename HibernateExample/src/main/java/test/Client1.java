package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import beans.Employee;
import beans.Student;

public class Client1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		Criteria c = s.createCriteria(Employee.class);
		   Projection p1=Projections.property("name");
		   ProjectionList plist=Projections.projectionList();
		   plist.add(p1);
		     c.setProjection(plist);
		     List<String> list2=c.list();
				for(String str:list2) {
					 System.out.println(str);
				}
		     //System.out.println(list2);
		   
				s.close();
		sf.close();

		// System.out.println("Table created");

	}

}
