package com.question_2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Product> pqp = new PriorityQueue<>(new SortByPrice());

		Scanner sc = new Scanner(System.in);

		System.out.println("How many product do you want to add..?");
		int n = sc.nextInt();

		int i=1;
		while (i <= n) {
			System.out.println("Enter details for product : "+i);
			System.out.println("Enter product Id..");
			int id = sc.nextInt();

			System.out.println("Enter product Name..");
			String name = sc.next();

			System.out.println("Enter product Price..");
			int price = sc.nextInt();
			
			Product p = new Product(id, name, price);
			
			pqp.add(p);
			
			i++;
	
		}
		
//		Iterator<Product> itr =  pqp.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		Product p;
		while((p=pqp.poll())!=null) {
			System.out.println(p);
		}
		

	}
}
