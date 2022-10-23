package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Department;

public class AddDepartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter dept details:");
		EmployeeDao dao = new EmployeeDaoImpl();
		Department dept = new Department();
		System.out.println("enter departement name:");
		dept.setDeptName(sc.next());
		System.out.println("enter department location:");
		dept.setLocation(sc.next());
		dao.addDepartment(dept);
	}

}
