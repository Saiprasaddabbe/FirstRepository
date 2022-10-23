package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
		Student student = em.find(Student.class, 1);
		if (student != null) {
			System.out.println(student);
			Student student2 = new Student(25, "Amit", 650);
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.persist(student2);
//		et.commit();
			
			em.getTransaction().begin();
			em.persist(student2);//em.remove();//student2.setmarks(student.getMarks()+50);
			em.getTransaction().commit();
			
		} else {
			System.out.println("Record is not found");
		}


		em.close();
		
		System.out.println("Student saved..");
		
	}

}
