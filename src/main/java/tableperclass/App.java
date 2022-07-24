package tableperclass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(".... Started.....");
		
		Employee e1 = new Employee();
				e1.setName("Prathamesh");
		Employee e2 = new Employee();
				e2.setName("Mahesh");
		
		Reg_Emp r1 = new Reg_Emp();
		r1.setName("Aniket");
		r1.setSalary(100000);
		r1.setBonus(1000);
		
		Reg_Emp r2 = new Reg_Emp();
		r2.setName("Pravin");
		r2.setSalary(20000);
		r2.setBonus(2000);
		
		Temp_Emp t1 = new Temp_Emp();
		t1.setName("Amar");
		t1.setPay_per_Hour(2000);
		t1.setDuration("12 Months");
		
		Temp_Emp t2 = new Temp_Emp();
		t2.setName("Yogesh");
		t2.setPay_per_Hour(3000);
		t2.setDuration("18 Months");
		
		SessionFactory f = new Configuration().configure("tableperclass/TablePerClass.cfg.xml").buildSessionFactory();
		Session ses = f.openSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(e1);
		ses.save(e2);
		ses.save(r1);
		ses.save(r2);
		ses.save(t1);
		ses.save(t2);
		ses.save(e1);
		
		tx.commit();
				
		ses.close();
		f.close();
		
		System.out.println(".... Ended.....");
	}

}
