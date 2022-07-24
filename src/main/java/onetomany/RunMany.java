package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******Start*******");
		
		Institute i1 = new Institute();
				i1.setInst_ID(112233);
				i1.setName("Mouni Vidyapith");
		Institute i2 = new Institute();
				i2.setInst_ID(445566);
				i2.setName("Rayat Shikshan Sanstha");
				i2.setCourses(null);
				
		Courses c1 = new Courses();
				c1.setC_Id(101);
				c1.setC_name("Chemistry");
				c1.setIns(i1);
				
		Courses c2 = new Courses();
				c2.setC_Id(102);
				c2.setC_name("Physics");
				c2.setIns(i1);
		
		Courses c3 = new Courses();
				c3.setC_Id(103);
				c3.setC_name("Maths");
				c3.setIns(i1);
		
		Courses c4 = new Courses();
				c4.setC_Id(104);
				c4.setC_name("Stats");
				c4.setIns(i2);
		
		Courses c5 = new Courses();
				c5.setC_Id(105);
				c5.setC_name("Botany");
				c5.setIns(i2);

		Courses c6 = new Courses();
				c6.setC_Id(106);
				c6.setC_name("Zoology");
				c6.setIns(i2);
		
		Set <Courses> course1 =  new HashSet<Courses>();
					course1.add(c1);
					course1.add(c2);
					course1.add(c3);
					i1.setCourses(course1);
		
		Set <Courses> course2 =  new HashSet<Courses>();
					course2.add(c4);
					course2.add(c5);
					course2.add(c6);
					i2.setCourses(course2);
		
		Configuration cfg = new Configuration();
		 			  cfg.configure("onetomany/Many.cfg.xml");
		  SessionFactory factory = cfg.buildSessionFactory();
		  Session ses = factory.openSession();
		  		ses.save(i1);
		  		ses.save(i2);
		  		ses.save(c1);
		  		ses.save(c2);
		  		ses.save(c3);
		  		ses.save(c4);
		  		ses.save(c5);
		  		ses.save(c6);
		Transaction tx = ses.beginTransaction();
					tx.commit();

		Institute ins =(Institute)ses.get(Institute.class, 112233);
		System.out.println(ins.getName());
		
		for(Courses cos1 : ins.getCourses())
		{
			System.out.println(cos1.getC_name());
		}
		
		ses.close();
		factory.close();

		System.out.println("*******Ended*********");

	}

}
