package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hql_TAble_Table {

	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("resources/oracle.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			String hql = "insert into NewStudent(id,name,email,address) select"
					+ " s.id,s.name,s.email,s.address from OldStudent s";
			Query q = s.createQuery(hql);
			int i = q.executeUpdate();
			t.commit();
			s.close();
			sf.close();
			System.out.println("No of row Affecte" + i);
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}
