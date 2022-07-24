package cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import manytomany.Actor;
import manytomany.Movie;

public class DemoCascade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Actor a1 = new Actor();
				a1.setCity("India");
				a1.setName("Hritik Roshan");
		
		Movie m1 = new Movie();
				m1.setName("Krish");
				m1.setYear(2004);
				
		Movie m2 = new Movie();
				m2.setName("Kaho Na Pyaar hai");
				m2.setYear(2006);
				
		Movie m3 = new Movie();
				m3.setName("WAR");
				m3.setYear(2019);
		
		
		List<Movie>	s = new ArrayList<Movie>();
					s.add(m1);
					s.add(m2);
					s.add(m2);
				
				a1.setMovie(s);
				
				
		Configuration cfg = new Configuration();
		cfg.configure("manytomany/ManyToMany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(a1);
		tx.commit();
		
		ses.clear();
		factory.close();
		
		System.out.println(" ........Ended.....");
		
	}

}
