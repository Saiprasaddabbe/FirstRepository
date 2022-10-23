package com.question_3;

import java.util.Comparator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member  {
	int memberId;
	String memberName;
	int membershipNo;
	LocalDate membershipEnddate;

	public Member(int memberId, String memberName, int membershipNo, String membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		
		DateTimeFormatter ldtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(membershipEnddate,ldtf);
		
		this.membershipEnddate = ld;
	}

	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}

	
}
