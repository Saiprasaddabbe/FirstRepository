package com.masai.model;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
	
		EntityManager em= EMUtil.provideEntityManager();
		
		
		Employee emp = em.find(Employee.class,1);
		em.close();
		
		
		List<Address> addresses = emp.getAddresses(); 
		System.out.println(addresses);
		
		System.out.println("done");
		
		
		
		em.close();
	}

}
