package question_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

	List<Book> books = new ArrayList<>();

	void addBook(Book book) throws BookException {
		if (books.size() > 0) {
			for (Book b : books) {
				if (b.getIsbn() == book.getIsbn()) {
					BookException be = new BookException("Book already exists");
					throw be;
				} else {
					books.add(book);
					System.out.println("Book added successfully.");
				}

			}
		} else {
			books.add(book);
			System.out.println("Book added successfully");
		}

	}

	List<Book> viewAllBooks() throws BookException {

		if (books.size() > 0) {
			return books;
		} else {
			BookException be = new BookException("Booklist is empty..");
			throw be;

		}

	}

	List<Book> viewBooksByAuthor(String author) throws BookException {
		List<Book> authorBooks = new ArrayList<>();

		if (books.size() > 0) {
			for (Book b : books) {
				if (b.getAuthor() == author) {
					authorBooks.add(b);
				}
			}
			if(authorBooks.size()>0) {
				return authorBooks;
			}else {
				BookException be = new BookException("None of the book published by the author "+author);
				throw be;
			}
			
		} else{
			BookException be = new BookException("Booklist is empty ");
			throw be;
		}
		
		
	}

	

	Book getBookByISBN(int isbn) throws BookException {
		for (Book b : books) {
			if (b.getIsbn() == isbn) {
				return b;
			}
		}

		BookException be = new BookException("Invalid ISBN");
		throw be;
	}

}
