package com.question_3;

public class Book {
	int bookId;
	String bookName;
	String BookAuthor;
	
	 public Book() {

	 }
	 
	public Book(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		BookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
	}
	
	

	
}
