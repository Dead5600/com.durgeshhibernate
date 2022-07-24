package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import onetooneuni.Answer;

public class DemoPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// pagination programme
		SessionFactory fact = new Configuration().configure("onetooneuni/UniHiber.cfg.xml").buildSessionFactory();
		
		Session ses = fact.openSession();
		
				Query  q =   ses.createQuery("from Answer");
						
					// setting parameters  from where we want to fetch data in database  / starting point	
						q.setFirstResult(1);
						
					// setting parameters upto where we want to fetch data  /  how many pages we want to fetch
						q.setMaxResults(5);
						
		List <Answer> l1 =  q.list();
				
				for (Answer a1 : l1 ) {
					System.out.println(a1.getId() +"\t "+a1.getAnswer());
				}
						
						
				ses.close();
				fact.close();
		
		
		
	}

}
