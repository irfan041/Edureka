package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hql_UpdateDemo {

	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("resources/oracle.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			String hql = "update NewStudent set name='xyz' where id='101'";
			Query q = s.createQuery(hql);
			int i = q.executeUpdate();
			t.commit();
			s.close();
			sf.close();
			System.out.println("No of row Affecte" + i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
