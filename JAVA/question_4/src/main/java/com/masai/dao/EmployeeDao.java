package com.masai.dao;

import java.util.List;

import com.masai.entities.ContractualEmployee;

import com.masai.entities.Employee;
import com.masai.entities.SalariedEmployee;


public interface EmployeeDao {
	void saveContractualEmployees(ContractualEmployee contractualEmployee) ;
	void saveSalariedEmployees(SalariedEmployee SalariedEmployee) ;
	List<SalariedEmployee> getAllSalariedEmployeedetails();
	List<ContractualEmployee> getAllContractualEmployee();
	

}
