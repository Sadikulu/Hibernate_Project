package com.hb07.bi_onetomany;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.action.internal.OrphanRemovalAction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student07.class).addAnnotatedClass(Book07.class);
		
		SessionFactory sf= con.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
         
//		Student07 student1=session.get(Student07.class,1001);
//		student1.getBookList().forEach(System.out::println);
		
		//öğrencinin bilgilerini getirelim
//		String sqlQuery1="select s.student_name, b.name from student07 s inner join book07 b on s.id=b.student_id";
//		List<Object[]> resultList1=session.createSQLQuery(sqlQuery1).getResultList();
//		for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}
		
//		String hqlQuery1="select s.name,b.name from Student07 s inner join fetch Book07 b on s.id=b.student";
//		List<Object[]> resultList2=session.createQuery(hqlQuery1).getResultList();
//		resultList2.forEach(s->System.out.println(Arrays.toString(s)));
	
//		String sqlQuery2="delete from book07";
//		int numOfRec=session.createSQLQuery(sqlQuery2).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec);
//		
//		String sqlQuery3="delete from student07";
//		int numOfRec1=session.createSQLQuery(sqlQuery3).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec1);
		
//		String hqlQuery2="delete from Book07";
//		int numOfRec2=session.createQuery(hqlQuery2).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec2);
		
//		String hqlQuery3="delete from Student07";
//		int numOfRec3=session.createQuery(hqlQuery3).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec3);
		
		//kitap ismine göre kitap silmeyi sağlayan hql yazın
//		String hqlQuery4="delete from Book07 b where b.name='John''s Art Book'";
//		int numOfRec4=session.createQuery(hqlQuery4).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec4);
		
//		String hqlQuery5="delete from Book07 b where b.student=1002";//referans ile silme
//		int numOfRec5=session.createQuery(hqlQuery5).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec5);
		
		//herhangi bir kitabı olmayan öğrenciyi id ile silme
//		String hqlQuery6="delete from Student07 s where s.id=1001";
//		int numOfRec6=session.createQuery(hqlQuery6).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec6);
		
		/*update or delete on table "student07" violates foreign key constraint 
		"fk95pa12xmsmpq144c2dq69x5m1" on table "book07"*/
		//eğer bu öğrencinin bir kitabı varsa book tablosunda bir forein keye karşılık gelir
		//kitaba sahip bir öğrenciyi silebilmek için
		//1-öğrenciye ait kitapları silip daha sonra öğrenciyi silebiliriz
//		String hqlQuery7="delete from Student07 s where s.id=1003";
//		int numOfRec7=session.createQuery(hqlQuery7).executeUpdate();
//		System.out.println("Effected Row count : "+numOfRec7);
		
		
//		Student07 student1=session.get(Student07.class,1001);
//		session.delete(student1);
		//OrphanRemoval yaptığımız için kitab listin indexi null yapınca siliyor
//		student1.getBookList().set(0,null);
		
//		String hqlQuery8="select s from Student07 s join Book07 b on s.id=b.student";
//		List<Object[]> resultList3=session.createQuery(hqlQuery8).getResultList();
//		resultList3.forEach(s->System.out.println(Arrays.toString(s)));
		
//		String hqlQuery9="select s from Student07 s join s.bookList";
//		session.createQuery(hqlQuery9).getResultList();
		
//		String hqlQuery10="select s from Student07 s join s.bookList b where b.name like '%Java%'";
//		List<Student07> resultList4=session.createQuery(hqlQuery10,Student07.class).getResultList();
//		resultList4.forEach(s->System.out.println(s));
		
		
		
		tx.commit();
		session.close();
        sf.close();
	}

}
