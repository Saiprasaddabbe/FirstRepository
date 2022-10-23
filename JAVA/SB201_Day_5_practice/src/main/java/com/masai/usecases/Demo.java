package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provieEntityManager();
//		String jpql = "select a from Account a where a.name = 'Rahul'";
//		TypedQuery<Account> tq = em.createQuery(jpql, Account.class);
//		Account a = tq.getSingleResult();
//		System.out.println(a);

//		String jpql = "update Account set balance=balance+3000";
//        Query q = em.createQuery(jpql);
//        em.getTransaction().begin();
//        int x = q.executeUpdate();
//		em.getTransaction().commit();
//		em.close();
//		System.out.println(x+"row affected");

//		String jpql = "update Account set balance=balance+?1 where name =?2";
//        Query q = em.createQuery(jpql);
//        q.setParameter(1, 500);
//        q.setParameter(2, "rahul");
//        
//        em.getTransaction().begin();
//        int x = q.executeUpdate();
//        em.getTransaction().commit();
//        em.close();
//        System.out.println(x+"row executed");

//		String jpql = "update Account set name=:n1 where name=:n2";
//		Query q = em.createQuery(jpql);
//		q.setParameter("n1", "Saiprasad");
//		q.setParameter("n2", "Rahul");
//		em.getTransaction().begin();
//		int x = q.executeUpdate();
//		em.getTransaction().commit();
//		em.close();
//		
//		System.out.println(x+" record updated");
//		
//		String jpql = "select a.name from Account a where a.name =:n1";
//		
//		TypedQuery<String> q =   em.createQuery(jpql,String.class);
//		q.setParameter("n1", "saiprasad");
//		
//		String s =  q.getSingleResult();
//		System.out.println(s);
////		em.close();

//		String jpql = "select balance from Account";
//		TypedQuery<Integer> q =  em.createQuery(jpql,Integer.class);
//		List<Integer> list =  q.getResultList();
//		
//		list.forEach(s->System.out.println(s));

//		String jpql = "select name,balance from Account";
//		Query q = em.createQuery(jpql);
//		List<Object[]> list =  q.getResultList();
//		
//		for(Object[] l:list) {
//			System.out.println("Name is "+l[0]);
//			System.out.println("Balance is "+l[1]);
//			
//			System.out.println("===========================");
//		}

//		String jpql = "select sum(balance) from Account";
//		TypedQuery<Long> q = em.createQuery(jpql,Long.class);
//		
//		long result =  q.getSingleResult();
//		System.out.println(result);
//		
//		em.close();

		Query q = em.createNamedQuery("account.getBalance");

		 q.setParameter("bal", 4000);
		
		 List<Account>  list =  q.getResultList();
		list.forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
