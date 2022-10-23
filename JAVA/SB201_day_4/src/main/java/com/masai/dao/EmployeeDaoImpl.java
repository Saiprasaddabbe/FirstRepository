package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		emp = employee;
		em.getTransaction().commit();
		em.close();
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;
		EntityManager em = EMUtil.provideEntityManager();
		employee = em.find(Employee.class, empId);
		if (employee != null) {
			return employee;
		} else {
			throw new EmployeeException("Empoyee does not exixsts");
		}

	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;

		EntityManager em = EMUtil.provideEntityManager();
		employee = em.find(Employee.class, empId);

		if (employee != null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			em.close();
		} else {
			throw new EmployeeException("Employee does not exists");
		}

		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EMUtil.provideEntityManager();

		emp = em.find(Employee.class, employee.getEmpId());
		if(emp!=null) {
			emp.setName("newNAME");
			em.getTransaction().begin();
			em.merge(emp);
			em.getTransaction().commit();
			em.close();
			
		}else {
			throw new EmployeeException("Employee Does not exists");
		}
		

		return emp;
	}

}
