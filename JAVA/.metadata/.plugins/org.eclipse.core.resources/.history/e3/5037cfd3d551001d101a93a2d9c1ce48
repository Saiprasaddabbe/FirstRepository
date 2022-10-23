package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.EMUtility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
		Query q = em.createNamedQuery("account.getBalance");
		q.setParameter("bal", 5000);
	    List<Account> list 	= q.getResultList();
		list.forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
	}

}
