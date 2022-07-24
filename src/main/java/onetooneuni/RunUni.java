package onetooneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("begin the programme....");
		
		Answer a1 = new Answer();
				a1.setId(20);
				a1.setAnswer("Prthamesh");
		
		Answer a2 = new Answer();
				a2.setId(21);
				a2.setAnswer("Kolhapur");
		
		Answer a3 = new Answer();
				a3.setId(22);
				a3.setAnswer("Trecking");
		
		
	/*	Questions q1 = new Questions();
				q1.setId(110);
				q1.setQuestion("What is your name ?");
				q1.setAns(a1);
		
		Questions q2 = new Questions();
				q2.setId(111);
				q2.setQuestion("What is your native place ?");
				q2.setAns(a2);
		
		Questions q3 = new Questions();
				q3.setId(113);
				q3.setQuestion("What is your hobby ?");
				q3.setAns(a3);		*/
	
		Configuration cfg = new Configuration();
		cfg.configure("onetooneuni/UniHiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		/*session.save(q1);
		session.save(q2);
		session.save(q3); */
		
		tx.commit();
		//System.out.println(session.get(Questions.class, 113));
		
		
		session.close();
		factory.close();
		
		System.out.println("end the programme....");
	}

}
