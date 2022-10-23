package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;

public class GetDepartmentDetailsByEmployeeId {

	public static void main(String[] args) {
		EmployeeDao dao =  new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the employee id:");
		 int empId = sc.nextInt();
		 
		

			Department dept;
			try {
				dept = dao.getDepartmentDetailsByEmployeeId(empId);
				System.out.println(dept);
			} catch (DepartmentException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
		

	}

}
