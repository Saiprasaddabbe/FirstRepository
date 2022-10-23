package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalariedEmployee extends Employee {

	@Id
	private int salary;
	private String email;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + "]";
	}

}
