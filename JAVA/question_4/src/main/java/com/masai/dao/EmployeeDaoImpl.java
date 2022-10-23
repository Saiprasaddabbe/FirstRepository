package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtility.EMUtil;
import com.masai.entities.ContractualEmployee;

import com.masai.entities.Employee;
import com.masai.entities.SalariedEmployee;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManager em = EMUtil.provideEntityManager();

	@Override
	public void saveContractualEmployees(ContractualEmployee contractualEmployee) {

		em.getTransaction().begin();
		em.persist(contractualEmployee);
		em.getTransaction().commit();

		System.out.println("done");
	}

	@Override
	public void saveSalariedEmployees(SalariedEmployee SalariedEmployee) {

		em.getTransaction().begin();
		em.persist(SalariedEmployee);
		em.getTransaction().commit();
	
		System.out.println("done");
	}

	@Override
	public List<SalariedEmployee> getAllSalariedEmployeedetails() {
		String jpql = "from SalariedEmployee";
		Query q = em.createQuery(jpql);
		List<SalariedEmployee> list = q.getResultList();
		em.close();
		return list;

	}

	@Override
	public List<ContractualEmployee> getAllContractualEmployee() {
		String jpql = "from ContractualEmployee";
		Query q = em.createQuery(jpql);
		List<ContractualEmployee> list = q.getResultList();
		em.close();
		return list;
	}

}
