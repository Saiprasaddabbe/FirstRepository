package com.masai.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmployeeException;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class Usecase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name");
		String name = sc.next();

		System.out.println("Enter Employee address");
		String address = sc.next();
		
		System.out.println("Enter Employee salary");
		int salary = sc.nextInt();

		
		Employee employee = new Employee();
		employee.setAddress(address);
		employee.setName(name);
		employee.setSalary(salary);

		EmployeeDao edao = new EmployeeDaoImpl();
		try {
			Employee emp1 = edao.registerEmployee(employee);
			System.out.println(emp1);
		} catch (EmployeeException e) {

			e.printStackTrace();
		}

	}

}
