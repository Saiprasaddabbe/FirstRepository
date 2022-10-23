package com.Q3;

import java.util.LinkedList;

import java.util.List;

public class Demo {
	public static <T> void doTransactions(List<T> list) {
      
		for(Object a:list) {
		if(a instanceof CardPayment){
				CardPayment c1 =  (CardPayment)a;
				c1.doPayment();
			}else {
				CashPayment c1 = (CashPayment)a;
				c1.doPayment();
			}
		}
		

	}
	public static void main(String[] args) {
	
        List<CashPayment> list1 = new LinkedList<>();
        list1.add(new CashPayment(8000));
        list1.add(new CashPayment(7000));
        
        List<CardPayment> list2 = new LinkedList<>();
        
        list2.add(new CardPayment(6000));
        list2.add(new CardPayment(9000));
        
		doTransactions(list2);
		doTransactions(list1);
		
	}
}
