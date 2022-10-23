package practice;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {

		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("nameUnit");
		EntityManager em =  emf.createEntityManager();
		
		Student student = new Student();
		student.setName("sai");
		student.setMarks(120);
		
		Product product = new Product();
		product.setPname("pen");
		product.setPrice(12);
		
		em.getTransaction().begin();
		em.persist(student);
		em.persist(product);
		em.getTransaction().commit();
		em.close();
		
		
		
		
//		Student student = new Student(78, "N3", 880);
		
//		student = em.find(Student.class,11);
//         System.out.println(student);
//		


//		em.getTransaction().begin();
//		em.persist(student);
//		em.getTransaction().commit();
//        em.close();		

        System.out.println("Done");
		 
		
		

	}

}
