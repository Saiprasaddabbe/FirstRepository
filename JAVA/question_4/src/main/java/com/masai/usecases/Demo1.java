package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.SalariedEmployee;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao edao = new EmployeeDaoImpl();
		
		for( int i=1;i<=4;i++) {
			SalariedEmployee emp = new SalariedEmployee();
			System.out.println("enter employee name");
			emp.setEmpName(sc.next());
			System.out.println("enter employee salary");
			emp.setSalary(sc.nextInt());
			System.out.println("enter employee email");
			emp.setEmail(sc.next());
			
			edao.saveSalariedEmployees(emp);
		}
		
		List<SalariedEmployee> salariedEmployees = edao.getAllSalariedEmployeedetails();
		salariedEmployees.forEach(s->System.out.println(s));
		

	}

}
