package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunMany_toMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(".......Start.......");
			// Creating Actor Objects
		Actor a1 = new Actor();
				a1.setName("Robert Downy Junior");
				a1.setCity("America");
				
		Actor a2 = new Actor();
				a2.setName("Johny Depp");
				a2.setCity("England");
		
		Actor a3 = new Actor();
				a3.setName("Tom Cruise");
				a3.setCity("America");
		
			// Creating Movie Objects 
		Movie m1 = new Movie();
				m1.setName("Iron Man");
				m1.setYear(2008);
				
		Movie m2 = new Movie();
				m2.setName("Sherlock Holmes");
				m2.setYear(2009);
		
		Movie m3 = new Movie();
				m3.setName("Pirates of the Carrebian");
				m3.setYear(2010);
		
		Movie m4 = new Movie();
				m4.setName("Fantastic Beast");
				m4.setYear(2014);
		
		Movie m5 = new Movie();
				m5.setName("Mission Impossible");
				m5.setYear(2008);
		
		Movie m6 = new Movie();
				m6.setName("Day and Night");
				m6.setYear(2014);
		
		List <Actor> l1 = new ArrayList<Actor>();
				l1.add(a1);
				l1.add(a2);
		
		List <Actor> l2 = new ArrayList<Actor>();
				l2.add(a1);
				
		List <Actor> l3 = new ArrayList<Actor>();
				l3.add(a2);
		
		List <Actor> l4 = new ArrayList<Actor>();
				l4.add(a3);
		
				
				
		
		
		List<Movie> movie1 = new ArrayList<Movie>();
					movie1.add(m1);
					movie1.add(m2);
		
		List<Movie> movie2 = new ArrayList<Movie>();
					movie2.add(m2);
					movie2.add(m3);
					movie2.add(m4);
		
		List<Movie> movie3 = new ArrayList<Movie>();
					movie3.add(m5);
					movie3.add(m6);
		
					//setting actor to movie
					m1.setActor(l2);
					m2.setActor(l1);
					m3.setActor(l3);
					m4.setActor(l3);
					m5.setActor(l4);
					m6.setActor(l4);
		
			// setting movie to actor
					a1.setMovie(movie1);
					a2.setMovie(movie2);
					a3.setMovie(movie3);
		
		
Configuration cfg = new Configuration();
		  cfg.configure("manytomany/ManyToMany.cfg.xml");
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
		s.save(a1);
		s.save(a2);
		s.save(a3);
		s.save(m1);
		s.save(m2);
		s.save(m3);
		s.save(m4);
		s.save(m5);
		s.save(m6);
		
Transaction tx = s.beginTransaction();		
			tx.commit();
				
			//fetching details of movie from Actor 
	Actor act1 = (Actor) s.get(Actor.class, 1);
		for(Movie m : act1.getMovie()) {
			System.out.println(m.getName());
			System.out.println(m.getYear());
		}

			// fetching details of actor from movie
	Movie movie = (Movie) s.get(Movie.class, 2);
			for(Actor a : movie.getActor()) {
				System.out.println(a.getName());
				System.out.println(a.getCity());
			}
		
			s.close();
		factory.close();
		
		System.out.println(".......Ended......");
	}

}
