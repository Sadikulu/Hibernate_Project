package com.hb08.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch08 {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student08.class)
				.addAnnotatedClass(Book08.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		Student08 student1 = session.get(Student08.class, 1001);
//		System.out.println(student1.getBookList());
		
//		Book08 book1 = session.get(Book08.class, 101);
//		System.out.println(book1.getStudents());
		
//		String hqlQuery1="select s from Student08 s join fetch s.bookList b";
//		List<Student08> resultList1=session.createQuery(hqlQuery1,Student08.class).getResultList();
//		resultList1.forEach(s->System.out.println(s));
		
		//isteğe göre alanlar seçiliyor burada join fetch kullanılmadı
//		String hqlQuery2="select s.name,b.name from Student08 s join s.bookList b";
//		List<Object[]> resultList2=session.createQuery(hqlQuery2).getResultList();
//		resultList2.forEach(s->System.out.println(Arrays.toString(s)));
		
		
		
		
		
		

		tx.commit();
		session.close();
		sf.close();
	}

}
