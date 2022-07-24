package tableperhierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Sanket");
		Employee e2 = new Employee("Mahesh");
		
		Permanant_Emp pemp1 = new Permanant_Emp("Rohit", 500000, 2000);
		Permanant_Emp pemp2 = new Permanant_Emp("Vighnesh", 788730,37320);
		
		Contract_Emp cemp1 = new Contract_Emp("Kiran", 600, "8 Months");
		Contract_Emp cemp2 = new Contract_Emp("Shubham",500,"4 Months");
		
		SessionFactory f = new Configuration().configure("tableperhierarchy/DemoRun.cfg.xml").buildSessionFactory();
		Session ses = f.openSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(e1);
		ses.save(e2);
		ses.save(pemp1);
		ses.save(pemp2);
		ses.save(cemp1);
		ses.save(cemp2);
		
		tx.commit();
		ses.close();
		f.close();
		
		System.out.println(".....ENDED.......");

	}

}
