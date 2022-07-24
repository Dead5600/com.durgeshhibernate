package com.sqldemo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class DemoSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("manytomany/ManyToMany.cfg.xml").buildSessionFactory();
		Session ses = factory.openSession();
		
		// Sql Query
		NativeQuery nq = ses.createNativeQuery("select * from Actor");
		List<Object []> l = nq.list();
		
		for(Object [] Actor : l) {
			System.out.println(Arrays.toString(Actor));
			System.out.println(Actor[1] + " : "+ Actor[2]);
			
		}
		ses.close();
		factory.close();
		
		System.out.println(".....Ended.......");
		
		
		
	}

}
