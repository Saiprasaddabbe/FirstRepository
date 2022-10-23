package question_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers ..");
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		try {
			int ans = a/b;
			System.out.println("the quotient of "+a+"/"+b+"="+ans);
			
			
		}catch (Exception e) {
			System.out.println("DivdedByZeroException caught");
			
		}finally {
			System.out.println("Inside finally block");
		}
		
		
	}

}
