package com.masai.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

//		Employee employee = new Employee();
//		employee.setEname("Sai");
//		employee.setSalary(1000);
//	    employee.getAddresses().add(new Address("c1", "p1", "st1"));
//		em.getTransaction().begin();
//		em.persist(employee);
//		em.getTransaction().commit();

		Employee employee = em.find(Employee.class, 13);
		em.close();

		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getSalary());
		System.out.println(employee.getAddresses());
		
		
		

	}

}