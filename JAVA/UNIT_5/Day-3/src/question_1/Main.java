package question_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("start of main..");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");

		try {
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		String message = null;
		int num3 = num1 / num2;
		if(num3 > 10){
		message = "Welcome to Exception Handling ";
		}
		System.out.println("Message is :"+message.toUpperCase());
		System.out.println("end of main");
		}catch(InputMismatchException ie) {
			System.out.println("Please Enter valid number");
		}catch(ArithmeticException ae) {
			System.out.println("num2 should not be 0");
		}catch(NullPointerException ne) {
			System.out.println("String value is null");
		}
		
		
	}

}
