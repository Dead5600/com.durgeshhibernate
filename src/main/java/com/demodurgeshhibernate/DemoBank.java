package com.demodurgeshhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Bank;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("...Started....");
		
	Configuration cfg = new Configuration();
	cfg.configure("Bank.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	Bank b1 = new Bank();
		b1.setBank_Name("Bank of India");
		b1.setAccount_No(12020843003l);
	Bank b2 = new Bank();
		b2.setBank_Name("Bank of Maharashtra");
		b2.setAccount_No(233924832273l);
		
	Bank b3 = new Bank();
		b3.setBank_Name("Kotak");
		b3.setAccount_No(1304004702l);
	
	session.save(b1);
	session.save(b2);
	session.save(b3);
	tx.commit();
	
	session.close();
	factory.close();
	
	System.out.println("Ended.....");
	}

}
