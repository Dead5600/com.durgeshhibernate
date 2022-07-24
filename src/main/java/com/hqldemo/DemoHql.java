package com.hqldemo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import onetooneuni.Questions;

public class DemoHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");
		
		Configuration cfg = new Configuration();
		cfg.configure("onetooneuni/UniHiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//  for fetching objects from database
		/*// Declare query where passing an Entity not table
		String q1 = "from Questions as q where q.id = : x and q.Question = : y " ;

		//Create  Query 
		Query query = session.createQuery(q1);
				query.setParameter("x", 110);
				query.setParameter("y","What is your name ?" );
		
				// It will give list of object from Entity
		List <Questions> list = query.list();				// While performing this operation on many to many mapping it will give stack overflow error
			for (Questions  que : list) {
					System.out.println(que.getQuestion() +" :"+que.getAns().getAnswer());
						}*/
		//System.out.println(list);
		

/*-------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		
		//   For deleting Objects from database

/*		Query que = session.createQuery("delete from Answer as a where a.id = : x ");
			que.setParameter("x", 130);
			int r = que.executeUpdate();
			System.out.println(r);
			System.out.println("....Deleted....");				*/
		
/*------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//   for Updating object from database
		
/*		Query q = session.createQuery(" Update Answer as a set a.Answer = : x  where a.id = : y");
				q.setParameter("x", "My name is Omkar");
				q.setParameter("y", 10);
			 int r = q.executeUpdate();
		System.out.println(r);
		
		System.out.println(" ...... Updated......");			*/
		
/*--------------------------------------------------------------------------------------------------------------------------------------------------*/		
		
		Query query = session.createQuery("Select q.id, q.Question,a.Answer from Questions as q inner join q.ans as a ");
			List<Object [] > list  =	query.getResultList();
		
		for (Object [] array : list) {
			System.out.println(Arrays.toString(array));
		}
		
		
		tx.commit();
		
		session.close();;
		factory.close();
		
		System.out.println("<<<<< Ended >>>>>>");
	}

}
