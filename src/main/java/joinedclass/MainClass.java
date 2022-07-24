package joinedclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("........Started.....");
		
		Payment p1 = new Payment();
		p1.setAmount(10000);

		Payment p2 = new Payment();
		p2.setAmount(66988);

		Card c1 = new Card();
		c1.setCard_No(1234567654);
		c1.setCard_type("Rupay");
		c1.setAmount(13927);

		Card c2 = new Card();
		c2.setCard_No(263478292);
		c2.setCard_type("Visa");
		c2.setAmount(298947);

		Cheque ch1 = new Cheque();
		ch1.setCheque_no(664276792);
		ch1.setCheque_type("Order");
		ch1.setAmount(57899049);

		Configuration cfg = new Configuration();
		cfg.configure("joinedclass/Payment.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		
		ses.save(p1);
		ses.save(p2);
		ses.save(c1);
		ses.save(c2);
		ses.save(ch1);
		
		
		Transaction tx = ses.beginTransaction();
					tx.commit();
					
		ses.close();
		factory.close();
		
		System.out.println(".....Ended.....");
	}
}
