package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
	EntityManager em =	EMUtil.provieEntityManager();
//    String jpql = "from Account";
//    Query q =  em.createQuery(jpql);
	
//	String jpql = "select a from Account a where a.name='Ramesh'";
//	String jpql = "from Account where name ='Ramesh'";
	String jpql = "from Account where name ='Rahul'";
	
//    Query q =  em.createQuery(jpql);
//	List<Account> accounts = q.getResultList();

    Query q =  em.createQuery(jpql);
	Account account = (Account)q.getSingleResult();
	System.out.println(account);
	
	em.close();
	
	
	}

}
