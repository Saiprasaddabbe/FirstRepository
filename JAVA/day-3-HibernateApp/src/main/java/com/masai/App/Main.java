package com.masai.App;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;

public class Main {

	public static void main(String[] args) {
		EmployeeDao edao = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose below options..!");
		System.out.println("1.Save Employee");
		System.out.println("2.Get Address By Employee Id");
		System.out.println("3.Give Bonus To Employee");
		System.out.println("4.Remove Employee");
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:
			System.out.println("Enter Employee Id:");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name:");
			String name = sc.next();
			System.out.println("Enter Employee Address:");
			String address = sc.next();
			System.out.println("Enter Employee Salary:");
			int salary = sc.nextInt();
			Employee employee = new Employee(id, name, address, salary);
			edao.save(employee);
			break;
		case 2:
			System.out.println("Enter Employee Id:");
			id = sc.nextInt();
            String message = edao.getAddressOfEmployee(id);
            System.out.println(message);
			break;
		case 3:
			System.out.println("Enter Employee Id:");
			id = sc.nextInt();
			System.out.println("Enter Bonus Amount:");
			int bonus = sc.nextInt();
		    message = edao.giveBonusToEmployee(id, bonus);
			System.out.println(message);
			break;
		case 4:
			System.out.println("Enter Employee Id:");
			id = sc.nextInt();
			edao.deleteEmployee(id);
			break;
		default:
			System.out.println("Invalid Entry..!");
			break;
		}
		
				
		

	}

}
