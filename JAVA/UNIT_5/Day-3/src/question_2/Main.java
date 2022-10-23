package question_2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static int checkAge(String dob) {

		int x = 0;

		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
			LocalDate dob1 = LocalDate.parse(dob, dtf);

			LocalDate currentDate = LocalDate.now();

			int age = Period.between(dob1, currentDate).getYears();
			if (age <= 0) {
				System.out.println("Date should not be in Future");
			} else {
//				System.out.println(age + " years");
				x = age;

			}
		} catch (DateTimeParseException dtpe) {
			System.out.println("Please enter the date in correct format");
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dob..in dd/MM/yyyy formate");
		String dob = sc.next();
		int age = checkAge(dob);
		if (age != 0)
			System.out.println(age + " years");
	}

}
