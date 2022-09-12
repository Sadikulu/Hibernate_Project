package com.hb04.bi.onetoone;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Diary02.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		//student fetch ediyoruz bir id ile
		//Student04 student = session.get(Student04.class, 1001);
		
		//diary fetch ediyoruz bir id ile
		//Diary02 diary = session.get(Diary02.class, 101);
		
		//System.out.println(student);
		//System.out.println("-------------");
		//System.out.println(student.getDiary());
		//System.out.println("-------------");
		//System.out.println(diary);
		//System.out.println("-------------");
		//System.out.println(diary.getStudent());
		
		
		/*
		hql ile arka planda hibernate tarafından oluşturulan
        select student04x0_.std_name as col_0_0_,
        diary02x1_.name as col_1_0_ 
        from
        Student04 student04x0_ 
        inner join
        Diary02 diary02x1_ 
        on (student04x0_.id=diary02x1_.std_id)
            
        bizim yazdığımız HQL
        select s.name,d.name from Student04 s inner join fetch Diary02 d on s.id=d.student
        */
		
		
//		String hqlQuery1 = "select s.name,d.name from Student04 s inner join fetch Diary02 d on s.id=d.student";
//		List<Object[]> resultList1 = session.createQuery(hqlQuery1).getResultList();
//		/*for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}*/
//		resultList1.forEach(t->{System.out.println(Arrays.toString(t));});
		
		//left join
//		String hqlQuery2 = "select s.name,d.name from Student04 s left join fetch Diary02 d on s.id=d.student";
//		List<Object[]> resultList2 = session.createQuery(hqlQuery2).getResultList();
//		resultList2.forEach(t->{System.out.println(Arrays.toString(t));});
		
		//right join
//		String hqlQuery3 = "select s.name,d.name from Student04 s right join fetch Diary02 d on s.id=d.student";
//		List<Object[]> resultList3 = session.createQuery(hqlQuery3).getResultList();
//		resultList3.forEach(t->{
//		            System.out.println(Arrays.toString(t));});
		
		//full join
//		String hqlQuery4 = "select s.name,d.name from Student04 s full join fetch Diary02 d on s.id=d.student";
//		List<Object[]> resultList4 = session.createQuery(hqlQuery4).getResultList();
//		resultList4.forEach(t->{
//		            System.out.println(Arrays.toString(t));});
		
//		String hqlQuery5="from Student04 s inner join fetch s.diary";
//		List<Student04> resultList5=session.createQuery(hqlQuery5,Student04.class).getResultList();
//
//		for (Student04 student04 : resultList5) {
//		System.out.println(student04);
//		}

//		String hqlQuery6="from Diary02 d inner join fetch d.student";
//		List<Diary02> resultList6=session.createQuery(hqlQuery6,Diary02.class).getResultList();
//		
//		for (Diary02 diary02 : resultList6) {
//		System.out.println(diary02);
//		}
		
		
		
		
		
		
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
	}

}
