package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exceptions.EmployeeException;

public class GetAllEmployeeWithDEptName {

	public static void main(String[] args) {

		EmployeeDao dao =  new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the department name:");
		 String deptName = sc.next();
		 
		List<Employee> empList;
		try {
			empList = dao.getAllEmployeeWithDeptName(deptName);
			for(Employee e:empList) {
				System.out.println(e);
			}
		} catch (EmployeeException e1) {
			System.out.println(e1.getMessage());
		}finally {
			sc.close();
		}
		

		
		
		
		
	}

}
