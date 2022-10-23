package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provieEntityManager();

		Employee employee = new Employee();
        employee.setEname("Ram");
        employee.setSalary(85000);
        employee.getAddresses().add(new Address("state1", "city1", "pincode1"));
        employee.getAddresses().add(new Address("state2", "city2", "pincode2"));
        
        
        
        
        
        
        
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
//        
		System.out.println("done");
		
		
		em.close();
	
	}

}
