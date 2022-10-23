package question_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library l1 = new Library();
		// -------------
		try {
			l1.addBook(new Book(11, "N1", "Author1"));

		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
		// ---------------
		try {
			System.out.println("List of Books :" + l1.viewAllBooks());
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
		// -------
		try {
			System.out.println(l1.viewBooksByAuthor("Author1"));
		} catch (BookException e) {

			System.out.println(e.getMessage());
		}
		// ------
		try {
			System.out.println(l1.getBookByISBN(11));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Thank You..!!");

	}

}
