package question_1;

import java.util.Scanner;

public class Main {
	public static int squreIt(String num) throws NumberFormatException {
		try {
			int n = Integer.parseInt(num);
			return n * n;
		} catch (NumberFormatException e) {
		
			throw e;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num = sc.next();
		System.out.println("Enter an integer: ");
		try {
			int ans = squreIt(num);	
			System.out.println("The square value is: "+ans);
		}catch(Exception e) {
			System.out.println("Entered input is not a valid format for an integer.");			
		}
		System.out.println("The work has been done successfully");

	}

}
