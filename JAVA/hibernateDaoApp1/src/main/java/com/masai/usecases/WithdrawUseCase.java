package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class WithdrawUseCase {
	
	
	public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        AccountDao acdao = new AccountDaoImpl();
        System.out.println("Enter Account Number:");
        int ano = sc.nextInt();
        Account account = acdao.findAccount(ano);
        if(account!=null) {
        	System.out.println("Enter Ammount:");
        	int ammount = sc.nextInt();
        	
        	int balance = account.getBalance();
        	if(balance>=ammount) {
        		account.setBalance(balance-ammount);
        		boolean flag = acdao.updateAccount(account);
        		if(flag) {
        			System.out.println("Please collect Your Cash");
        		}else {
        			System.out.println("Technical Error..!");
        		}
        		
        	}else {
        		System.out.println("Not sufficient balance to withdraw");
        	}
        	
        	
        }
		
		
			

	}
}