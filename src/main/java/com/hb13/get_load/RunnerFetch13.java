package com.hb13.get_load;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch13 {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student13.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
//		System.out.println("Start to execute get method");
//		Student13 student1= session.get(Student13.class,1L);
//		System.out.println("Finish to execute get method");
//		System.out.println("Sutudent ID: "+student1.getId());
//		System.out.println("Sutudent get name: "+student1.getName());
//		
//		System.out.println("----------------------------------");
//		
//		System.out.println("Start to execute load method");
//		Student13 student2= session.load(Student13.class,2L);
//		System.out.println("Finish to execute load method");
//		System.out.println("Sutudent ID: "+student2.getId());
//		System.out.println("Sutudent Load name: "+student2.getName());
		
		//db'de olmayan id'ler ile get load metodlarının davranışını görme
//		System.out.println("Start to execute get method");
//		Student13 student1= session.get(Student13.class,5L);
//		System.out.println("Finish to execute get method");
//		
//		if (student1!=null) {
//			System.out.println("Sutudent ID: "+student1.getId());
//		    System.out.println("Sutudent get name: "+student1.getName());
//		}
//		
//		System.out.println("----------------------------------");
//		
//		System.out.println("Start to execute load method");
//		Student13 student2= session.load(Student13.class,10L);
//		System.out.println("Finish to execute load method");
//		
//		if (student2!=null) {
//			System.out.println("Sutudent ID: "+student2.getId());
//		    System.out.println("Sutudent Load name: "+student2.getName());
//		}
		
		//load metodu ile obje referansı alınır ve sonra delete çağırılır
		//get metodu çağırılmayarak db'ye hit engellenmiş olur
		Student13 studentFound= session.load(Student13.class,1L);
		session.delete(studentFound);
		

		tx.commit();
		session.close();
		sf.close();
	}

}