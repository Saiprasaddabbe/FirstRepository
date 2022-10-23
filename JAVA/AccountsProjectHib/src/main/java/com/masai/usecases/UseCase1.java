package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class UseCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDao adao = new AccountDaoImpl();
		System.out.println("Enter Accound Id:");
        int id = sc.nextInt();
        
        Account account = adao.findById(id);
        
        if(account!=null) {
        	System.out.println(account);
        }
        
        
		
		
		
	}

}
