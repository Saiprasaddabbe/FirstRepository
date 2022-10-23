package practice_day_1;

public class Main {

	public int fun(int i) throws InvalidAgeException {
		if (i == 10) {

			return i;
		}

		InvalidAgeException iae = new InvalidAgeException("hi bro");
		throw iae;

	}

	public static void main(String[] args) {
		Main m = new Main();
		try {

			int a = m.fun(1);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("End of main");

	}
}