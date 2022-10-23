package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Address;
import com.masai.entities.Employee;

public class AddEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name:");
		String name = sc.next();
		System.out.println("Enter Employee salary:");
		String salary = sc.next();
		System.out.println("Enter Employee city:");
		String city = sc.next();
		System.out.println("Enter Employee state:");
		String state = sc.next();
		System.out.println("Enter Employee pincode:");
		String pincode = sc.next();
		
		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setSalary(salary);
		employee.setAddress(new Address(city, state, pincode));
		
		EmployeeDao edao = new EmployeeDaoImpl();
		edao.addEmployee(employee);
		System.out.println("Employee added successfully");
		
	}

    
	
	
}
