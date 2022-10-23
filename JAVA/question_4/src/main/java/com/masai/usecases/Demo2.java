package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.ContractualEmployee;
import com.masai.entities.SalariedEmployee;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao edao = new EmployeeDaoImpl();

		for (int i = 1; i <= 4; i++) {
			ContractualEmployee emp = new ContractualEmployee();
			System.out.println("enter employee name:");
			emp.setEmpName(sc.next());
			System.out.println("Enter the np. of working days:");
			emp.setNoOfWorkingDays(sc.nextInt());
			System.out.println("Enter cost per Day:");
			emp.setCostofperday(sc.nextInt());
			System.out.println("Enter mobile number:");
			emp.setMobileNumber(sc.next());
			edao.saveContractualEmployees(emp);
		}

		List<ContractualEmployee> contractualEmployees = edao.getAllContractualEmployee();
		contractualEmployees.forEach(s -> System.out.println(s));

		System.out.println("done");

	}

}
