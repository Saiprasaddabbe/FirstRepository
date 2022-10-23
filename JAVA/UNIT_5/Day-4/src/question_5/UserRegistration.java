package question_5;

import java.util.Scanner;

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {

		if (userCountry.equalsIgnoreCase("india")) {
			System.out.println("User registration done successfully");

			return;
		}
		InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");

		throw ice;
	}

	public static void main(String[] args) {

		UserRegistration u1 = new UserRegistration();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");

		String name = sc.next();
		System.out.println("Enter country :");
		String country = sc.next();
		country = country;

		try {
			u1.registerUser(name, country);
			System.out.println("Thank you!");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
			System.out.println("Thank you!");
		}
	}
}
