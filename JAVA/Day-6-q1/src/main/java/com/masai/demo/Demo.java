package com.masai.demo;

import javax.persistence.EntityManager;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

      EntityManager	em	= EMUtil.providEntityManager();
		
		
		Collage c1 = new Collage();
		c1.setCollageName("c1");
		c1.setCollageAddress("pune");
		
		Student s1 = new Student();
		s1.setStudentName("s1");
		s1.setEmail("s1@gmail.com");
		s1.setMobileNumber("mob1");
		s1.setCollage(c1);
		
		Student s2 = new Student();
		s2.setStudentName("s2");
		s2.setEmail("s2@gmail.com");
		s2.setMobileNumber("mob2");
		s2.setCollage(c1);
		
		Student s3 = new Student();
		s3.setStudentName("s3");
		s3.setEmail("s3@gmail.com");
		s3.setMobileNumber("mob3");
		s3.setCollage(c1);
		
		Student s4 = new Student();
		s4.setStudentName("s4");
		s4.setEmail("s4@gmail.com");
		s4.setMobileNumber("mob4");
		s4.setCollage(c1);
		
		c1.getStudentList().add(s1);
		c1.getStudentList().add(s2);
		c1.getStudentList().add(s3);
		c1.getStudentList().add(s4);
		
		
	
		Collage c2 = new Collage();
		c2.setCollageName("c2");
		c2.setCollageAddress("mumbai");

		Student s5 = new Student();
		s5.setStudentName("s5");
		s5.setEmail("s5@gmail.com");
		s5.setMobileNumber("mob5");
		s5.setCollage(c2);
		Student s6 = new Student();
		s6.setStudentName("s6");
		s6.setEmail("s6@gmail.com");
		s6.setMobileNumber("mob6");
		s6.setCollage(c2);
		Student s7 = new Student();
		s7.setStudentName("s7");
		s7.setEmail("s7@gmail.com");
		s7.setMobileNumber("mob7");
		s7.setCollage(c2);
		Student s8 = new Student();
		s8.setStudentName("s8");
		s8.setEmail("s8@gmail.com");
		s8.setMobileNumber("mob8");
		s8.setCollage(c2);
		
		c2.getStudentList().add(s5);
		c2.getStudentList().add(s6);
		c2.getStudentList().add(s7);
		c2.getStudentList().add(s8);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
		System.out.println("done----");
		
	
		
		
		
	}

}
