package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import onetomany.Institute;
import onetooneuni.Answer;

public class DemoCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("onetooneuni/UniHiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();

		Criteria C = ses.createCriteria(Answer.class);
		/*
		 * List<Answer> list = C.list();
		 * 
		 * for (Answer i : list) { System.out.println(i.getAnswer( ) +" : " +
		 * i.getId());
		 * 
		 * }
		 */

		
		/// check this is not working
		/*
		 * C.add(Restrictions.eq("Answer", "prathamesh")); List<Answer> l2 = C.list();
		 * for (Answer i : l2) { System.out.println(i.getAnswer( ) +" : " + i.getId());
		 * 
		 * }
		 */

		
		  C.add(Restrictions.gt("id", 30));
		  List<Answer> l3 = C.list();
		  for (Answer i : l3)
		  {
			  System.out.println(i.getAnswer( ) +" : " + i.getId());
		  
		  }
		 
		ses.close();
		factory.close();

		System.out.println("......Successful....");

	}

}
