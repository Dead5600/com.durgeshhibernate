package onetoonebi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(".......Starting the Programe.........");
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		College c1 = new College();
				c1.setCollege_Id(100);
				c1.setCollege_Name("SSKB, Gargoti");
				c1.setGrade("A++");
				c1.setStd(s1);
				
		College c2 = new College();
				c2.setCollege_Id(200);
				c2.setCollege_Name("GCG, Gadhinglaj");
				c2.setGrade("B++");
				c2.setStd(s2);
		
		College c3 = new College();
				c3.setCollege_Id(300);
				c3.setCollege_Name("Matoshree Vidyamandir");
				c3.setGrade("A+");
				c3.setStd(s3);
				
				s1.setStudent_Id(444);
				s1.setStudent_name("Prathamesh");
				s1.setCity("Kolhapur");
				s1.setClg(c1);
				
				s2.setStudent_Id(222);
				s2.setStudent_name("Sandeep");
				s2.setCity("Kadgaon");
				s2.setClg(c2);
		
				s3.setStudent_Id(333);
				s3.setStudent_name("Sanket");
				s3.setCity("Khochi");
				s3.setClg(c3);
		
		Configuration cfg = new Configuration();
					  cfg.configure("onetoonebi/BiHiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
				ses.save(s1);
				ses.save(s2);
				ses.save(s3);
				ses.save(c1);
				ses.save(c2);
				ses.save(c3);
		Transaction tx = ses.beginTransaction();
					tx.commit();
					
		College clg = (College) ses.load(College.class, 100);
		System.out.println(clg.getStd().getStudent_name());
		
		Student std = (Student) ses.load(Student.class, 222);
		System.out.println(std.getClg().getCollege_Name());
				ses.close();
				factory.close();
				System.out.println(".......Endinging the Programe.........");
	}

}
