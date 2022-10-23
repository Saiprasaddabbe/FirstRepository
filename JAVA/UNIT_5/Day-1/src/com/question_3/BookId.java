package com.question_3;

import java.util.Comparator;

public class BookId implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		if(b1.bookId>b2.bookId) {
			return 1;
		}else if(b1.bookId<b1.bookId) {
			return -1;
		}
		else {
			return 0;
		}
	}

	
}
