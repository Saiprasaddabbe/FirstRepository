package com.masai.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.entity.Department;
import com.masai.entity.Employee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Department d1 = new Department();
		d1.setDname("HR");
		d1.setLocation("Pune");

		Department d2 = new Department();
		d2.setDname("Sales");
		d2.setLocation("Mumbai");

		Employee e1 = new Employee();
		e1.setName("Sai");
		e1.setSalary(120000);

		Employee e2 = new Employee();
		e2.setName("prasad");
		e2.setSalary(120000);

		e1.getDepts().add(d1);
		e1.getDepts().add(d2);

		e2.getDepts().add(d1);
		e2.getDepts().add(d2);

		d1.getEmps().add(e1);
		d1.getEmps().add(e2);

		d2.getEmps().add(e1);
		d2.getEmps().add(e2);

		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.getTransaction().commit();
		em.close();

		System.out.println("done...");

	}

}