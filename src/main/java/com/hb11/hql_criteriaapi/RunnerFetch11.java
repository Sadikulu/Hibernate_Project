package com.hb11.hql_criteriaapi;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RunnerFetch11 {

	public static void main(String[] args) {

		// CRUD (create,read,update,delete)
		// C-session.save
		// R-session.get,hql,sql (select)
		// U--session.update, udapte query
		// D-session.delete, hql,sql

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student11.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		Student11 student = session.get(Student11.class, 1L);
//		student.setName("Updated "+student.getName());
//		session.update(student);
		
//		String hqlQuery1="UPDATE Student11 s SET s.name='Updated with HQL' where s.id=11";
//		int numOfRec=session.createQuery(hqlQuery1).executeUpdate();
//		System.out.println("Effected Row Count:"+ numOfRec);
		
//		String hqlQuery2="FROM Student11 s WHERE s.mathGrade<50";
//		List<Student11> resultList= session.createQuery(hqlQuery2,Student11.class).getResultList();
//
//		for (Student11 student : resultList) {
//			student.setMathGrade(50);
//			session.update(student);
//		}
		
//		int sMathGrade=80;
//		int lMathGrade=75;
//		
//		String hqlQuery3="UPDATE Student11 s SET s.mathGrade=:sMath where s.mathGrade<:lMath";
//		
//		Query query= session.createQuery(hqlQuery3);
//		
//		query.setParameter("sMath", sMathGrade);
//		query.setParameter("lMath", lMathGrade);
//		
//		int numOfRec2= query.executeUpdate();
//		System.out.println("Effected Row Count:"+ numOfRec2);
//		
		//hql query ile sum örneği
//		int matGrade=90;
//		
//		String hqlQuery4="SELECT sum(s.mathGrade) FROM Student11 s where s.mathGrade>:grade";
//		Query query= session.createQuery(hqlQuery4);
//		query.setParameter("grade", matGrade);
//		
//	 	Long sumMathGrade=(Long) query.uniqueResult();
//		System.out.println("Total math Grade:"+sumMathGrade);
		
		CriteriaBuilder cb= session.getCriteriaBuilder();
		CriteriaQuery<Student11>criteriaQuery= cb.createQuery(Student11.class);
		Root<Student11> root= criteriaQuery.from(Student11.class);
		
//		criteriaQuery.select(root);
		
//		Query<Student11> query1=session.createQuery(criteriaQuery);
//		List<Student11> resultList=query1.getResultList();
//		resultList.forEach(t->System.out.println(t));
		
//		criteriaQuery.select(root).where(cb.equal(root.get("name"),"Student Name 6"));
//		Query<Student11> query1=session.createQuery(criteriaQuery);
//		List<Student11> resultList2=query1.getResultList();
//		resultList2.forEach(t->System.out.println(t));
		
//		criteriaQuery.select(root).where(cb.greaterThan(root.get("mathGrade"),80));
//		Query<Student11> query3=session.createQuery(criteriaQuery);
//		List<Student11> resultList3=query3.getResultList();
//		resultList3.forEach(t->System.out.println(t));
		
//		criteriaQuery.select(root).where(cb.lessThan(root.get("mathGrade"),95));
//		Query<Student11> query4=session.createQuery(criteriaQuery);
//		List<Student11> resultList4=query4.getResultList();
//		resultList4.forEach(t->System.out.println(t));
		
		Predicate predicateForName=cb.equal(root.get("id"), 1L);
		Predicate predicateForMathGrade=cb.greaterThan(root.get("mathGrade"), 75);
		Predicate predicateStd= cb.or(predicateForName,predicateForMathGrade);
		Predicate predicateStd1= cb.and(predicateForName,predicateForMathGrade);
		criteriaQuery.where(predicateStd);
		criteriaQuery.where(predicateStd1);
		Query<Student11> query5=session.createQuery(criteriaQuery);
		List<Student11> resultList5=query5.getResultList();
		resultList5.forEach(t->System.out.println(t));
		
		
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
	}

}
