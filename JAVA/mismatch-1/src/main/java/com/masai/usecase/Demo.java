package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.EMUtility.EMUtil;
import com.masai.model.Address;
import com.masai.model.Employee;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Employee employee = new Employee();
		employee.setEname("Sai");
		employee.getAddresses().add(new Address("state1", "city1", "pincode-1","home"));
		employee.getAddresses().add(new Address("state2", "city2", "pincode-2","office"));
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();

	}

}
