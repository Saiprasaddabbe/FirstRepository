package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class UseCase4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDao adao = new AccountDaoImpl();
		System.out.println("Enter Accound Id:");
        int id = sc.nextInt();
        System.out.println("Enter Ammount:");
        int ammount = sc.nextInt();
       
        
        
        String message = adao.withdraw(ammount, id);
        
        System.out.println(message);
        
        
		
		
		
	}

}
