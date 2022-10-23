package com.question_3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Book> listOfBooks = new TreeSet<>(new BookId());

		Book b2 = new Book(2, "B", "Y");
		Book b1 = new Book(1, "A", "X");
		Book b3 = new Book(2, "B", "Y");

		listOfBooks.add(b1);
		listOfBooks.add(b2);
		listOfBooks.add(b3);

		TreeSet<Member> members = new TreeSet<>(new MemberId());
		
		Member m1 = new Member(101, "m1", 11, "15/01/2022");
		Member m2 = new Member(101, "m2", 12, "20/01/2022");
		Member m3 = new Member(103, "m3", 13, "25/01/2022");
		Member m4 = new Member(104, "m4", 14, "17/01/2022");
		Member m5 = new Member(105, "m5", 15, "11/01/2022");
		
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		members.add(m5);
		
		TreeSet<Member> members2 = new TreeSet<>(new MemberDate());
		
		for(Member m:members) {
			members2.add(m);
		}
		
		for(Member mTwo:members2) {
			System.out.println(mTwo);
		}
		
		
		
		
	}

}
