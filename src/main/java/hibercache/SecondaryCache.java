package hibercache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondaryCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory fact = new Configuration().configure("hibercache/Teacher.cfg.xml").buildSessionFactory();
		Session ses = fact.openSession();

//				 Teacher t1 =  new Teacher("KanadeSir", "CoreJava", "8");
//				 Teacher t2 = new Teacher("Anna", "MySql", "3");
//				 Teacher t3 = new Teacher("JDSir", "AdvanceJava", "5");

		Transaction tx = ses.beginTransaction();

		System.out.println(ses.get(Teacher.class, 1));
//		ses.persist(t3);
//		ses.persist(t2);
//		ses.persist(t1);

		tx.commit();
		ses.close();

		Session ses2 = fact.openSession();
		System.out.println(ses2.get(Teacher.class, 1));
		ses2.close();
		fact.close();
		System.out.println(".....Ended.....");

	}

}
