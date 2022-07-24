package com.demodurgeshhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Bike;
import pojo.Cars;



public class DemoBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programme Started.....  ");
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session =factory.openSession();
	
	Cars c1 = new Cars();
		c1.setCar_company("Maruti Suzuki");
		c1.setCar_name("Swift");
		c1.setModel(132323);
	Cars c2 = new Cars();
		c2.setCar_company("Renault");
		c2.setCar_name("Duster");
		c2.setModel(37428);
	Cars c3 = new Cars();	
		c3.setCar_name("R8");
		c3.setCar_company("Audi");
		c3.setModel(85249649);

		Bike b1 = new Bike("Splendar","Hero", "petrolium");
		b1.setCar(c1);
		
		Bike b2 = new Bike("Shine","Honda", "petrolium");
		b2.setCar(c2);
		
		Bike b3 = new Bike("fz","yamaha", "petrolium");
		b3.setCar(c3);
		Bike b4 = new Bike("Maestro","Hero", "Electrical");
		b4.setCar(c2);
		
	session.save(b1);
	session.save(b2);
	session.save(b3);
	session.save(b4);
	Transaction tx = session.beginTransaction();
	tx.commit();
	
	
	System.out.println(session.get(Bike.class, 2));
	System.out.println(session.load(Bike.class, 3));
	
	session.close();
	factory.close();
	
	System.out.println("Programme ended......");
		
	}

}
