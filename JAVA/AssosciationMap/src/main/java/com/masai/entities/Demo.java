package com.masai.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtility.Department;
import com.masai.EMUtility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
	    String jpql = "select emps from Department where dname =:dn";
	    
	    
	    
	    
//--------------------------------------------------------	    
//	    Query q = em.createQuery(jpql);
//	    q.setParameter("dn", "Sales");
//	    List<Employee> allemps =  q.getResultList();
//	    allemps.forEach(s->System.out.println(s));
//	    System.out.println("done..");
	    		
		
		
//-----------------------------------------------------------------
//		Department dept = em.find(Department.class, 1);
//		Employee emp = new Employee();
//		emp.setName("Mukesh");
//		emp.setSalary("9000");
//		
//		
//		em.getTransaction().begin();
//		dept.getEmps().add(emp);
//		em.getTransaction().commit();
		
//-------------------------------------------------		
//		Employee emp1  = new Employee();
//		emp1.setName("Amit");
//		emp1.setSalary("12000");
//		
//		Employee emp2  = new Employee();
//		emp2.setName("suresh");
//		emp2.setSalary("14000");
//		
//		Department dept = new Department();
//		dept.setDname("SALES");
//		dept.setLocation("Delhi");
//		dept.getEmps().add(emp1);
//		dept.getEmps().add(emp2);
//		
//		em.getTransaction().begin();
////		em.persist(emp1);
////		em.persist(emp2);used cascase no need to persist employee;
//		
//		em.persist(dept);
//		em.getTransaction().commit();
//		em.close();
//------------------------------------------------------		
		System.out.println("Done..");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
