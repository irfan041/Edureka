package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.NewStudent;

public class SelectSingleRow {
	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("resources/oracle.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();

			/*
			 * String hql = " from NewStudent where id='101'"; Query q = s.createQuery(hql);
			 * NewStudent ns = (NewStudent) q.uniqueResult(); System.out.println("Id=" +
			 * ns.getId()); System.out.println("Name=" + ns.getName());
			 * System.out.println("Email=" + ns.getEmail()); System.out.println("Address=" +
			 * ns.getAddress());
			 */

			String hql = " delete from NewStudent where id='101'";
			Query q = s.createQuery(hql);
			int nx = q.executeUpdate();
			 t.commit();
			
			System.out.println("Dat has deleted=" +nx);

			/*
			 * String hql = " select name from NewStudent"; Query q = s.createQuery(hql);
			 * List<String> ns = q.list(); for (String s1 : ns) { System.out.println("Name="
			 * + s1); }
			 */

			/*
			 * String hql = "from NewStudent"; Query q = s.createQuery(hql);
			 * List<NewStudent> ns = q.list(); for (NewStudent s1 : ns) {
			 * System.out.println("Id=" + s1.getId()); System.out.println("Name=" +
			 * s1.getName()); System.out.println("Email=" + s1.getEmail());
			 * System.out.println("Address=" + s1.getAddress());
			 * System.out.println("================================"); }
			 */
			s.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
