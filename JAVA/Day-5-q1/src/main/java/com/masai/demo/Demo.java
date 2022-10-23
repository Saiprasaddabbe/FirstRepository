package com.masai.demo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Address;
import com.masai.model.Customer;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Customer customer = new Customer();
		customer.setName("Shubham");
		customer.setEmail("shubhampatil@gmail.com");
		customer.setMobileNumber("1234567890");
		customer.getAddresses().add(new Address("state4", "city4", "pincode-4", "home"));
		customer.getAddresses().add(new Address("state5", "city5", "pincode-5", "office"));
		customer.getAddresses().add(new Address("state6", "city6", "pincode-6", "current"));

		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cid to get address:");
        int cid =  sc.nextInt();		
		
		String jpql = "from Customer where cid=:cid";
	    TypedQuery<Customer> q = em.createQuery(jpql,Customer.class);
	    q.setParameter("cid", cid);
      
	    Customer c = q.getSingleResult();
	    
	    System.out.println(c.getAddresses());
		
		em.close();

	}

}
