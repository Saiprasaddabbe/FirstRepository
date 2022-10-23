package com.masai.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmployeeException;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class Usecase4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmpId:");

		int empId = sc.nextInt();
       
		EmployeeDao edao = new EmployeeDaoImpl();
		try {
			Employee emp1 = edao.getEmployeeById(empId);
			emp1 = edao.updateEmployee(emp1);
			System.out.println(emp1);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());

		}

	}

}
