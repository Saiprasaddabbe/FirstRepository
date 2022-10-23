package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class UseCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDao adao = new AccountDaoImpl();
		System.out.println("Enter Accound Id:");
        int id = sc.nextInt();
        System.out.println("Enter Accound Email:");
        String email = sc.next();
        System.out.println("Enter Accound Address:");
        String address = sc.next();
        System.out.println("Enter Accound Balance:");
        double balance = sc.nextInt();
        
        Account account = new Account(id, email, address, balance);
        String message = adao.save(account);
        
        System.out.println(message);
        
        
		
		
		
	}

}
