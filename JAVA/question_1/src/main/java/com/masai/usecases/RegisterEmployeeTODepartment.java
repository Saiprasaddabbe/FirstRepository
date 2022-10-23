package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;

public class RegisterEmployeeTODepartment {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmployeeDao edao = new EmployeeDaoImpl();
		System.out.println("enter the employee id");
		int empid = sc.nextInt();
		System.out.println("enter the dept id");
		int depid = sc.nextInt();
		
		try {
			edao.registerEmployeeTODepartment(empid, depid);
		} catch (EmployeeException | DepartmentException e) {
			System.out.println(e.getMessage());
	
		}
	
		
		
	}

}
