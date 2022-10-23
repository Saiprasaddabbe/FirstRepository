package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.entities.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account findById(int id) {
		Account account = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		account = em.find(Account.class, id);
		if(account!=null) {
			return account;
		}else {
			System.out.println("Record Not found..!");
		}

		return account;
	}

	@Override
	public String save(Account account) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		message = "Account Saved Successfully..!";

		return message;
	}
		
		
		
		
		
	

	@Override
	public String deleteAccountById(int id) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, id);
		
		em.getTransaction().begin();
		em.remove(account);
		em.getTransaction().commit();
		em.close();
		message = "Account Removed Successfully..!";

		return message;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, accountId);
			
		em.getTransaction().begin();
		account.setBalance(account.getBalance()-amount);
		em.getTransaction().commit();
		em.close();
		message = "Withdrawl Successful..!";

		return message;
	}

	@Override
	public String deposit(double amount, int accountId) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, accountId);
			
		em.getTransaction().begin();
		account.setBalance(account.getBalance()+amount);
		em.getTransaction().commit();
		em.close();
		message = "Deposit Successful..!";

		return message;
		
	}
	
}
