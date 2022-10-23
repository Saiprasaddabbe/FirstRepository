package com.masai.dao;

import javax.persistence.EntityManager;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		boolean flag = false;

		EntityManager em = EMUtil.provieEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		flag = true;
		em.getTransaction().commit();
		em.close();

		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag = false;

		EntityManager em = EMUtil.provieEntityManager();
		Account account = em.find(Account.class, accno);

		if (account != null) {
			em.getTransaction().begin();
			em.remove(account);
			flag = true;
			em.getTransaction().commit();
			em.close();
		} else {
			System.out.println("Account not Exists..!");
		}

		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {

		boolean flag = false;
		EntityManager em = EMUtil.provieEntityManager();
		Account acc = em.find(Account.class, account.getAccno());
		
		
		if (acc != null) {
			em.getTransaction().begin();
			em.merge(account);
			flag = true;
			em.getTransaction().commit();
			em.close();
		} else {
			throw new IllegalArgumentException("Invalid Account");
		}

		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		Account account = null;

		EntityManager em = EMUtil.provieEntityManager();
		account = em.find(Account.class, accno);
		if (account != null) {
			return account;
		} else {
			throw new IllegalArgumentException("Invalid Account");
		}

	}

}
