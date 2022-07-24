package objectstates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onetooneuni.Answer;

public class StatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* There are 4 states of objects in hibernate
			1) Transient
			2) Persistent
			3) Detached
			4) Removed
			 
		 */	
		
		SessionFactory f = new Configuration().configure("onetooneuni/UniHiber.cfg.xml").buildSessionFactory();
		
		Answer ans = new Answer();
			ans.setAnswer("My name is Akash");
			ans.setId(150);
		// The object is newly created
		// ......... TRANSIENT STATE .........
			
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
				s.save(ans);
				
			ans.setAnswer("My school is GCG  ");
		// It will Change automatically in database even though we save object before updating	
				
				
				tx.commit();
		/* Object is in persistent state
		 Which is associated with both session and databases.
		WE can assist object in persistent state
		*/		

		
		s.close();
		//s.clear();
		// By closing session object will be in detached state i.e not associated with session but stored in database
		
					ans.setAnswer("Important thing in my life is My family and friends");
		//WE cannot change the value in database when object is in detached state
					
		
					
					/*
					 * When object is said to be in removed state
					 * Before closing session getting the object
					 * i.e     s.get();
					 * And     delete object from database
					 * */
					
		f.close();	
			
	}

}
