package com.question_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class MemberDate implements Comparator<Member> {

	@Override
	public int compare(Member m1, Member m2) {
		LocalDate now = LocalDate.now(); 
		
		int obj1 = (int)ChronoUnit.DAYS.between(m1.membershipEnddate, now);
		int obj2 = (int)ChronoUnit.DAYS.between(m2.membershipEnddate, now);
		
		
		
		if(obj1>obj2)
		{
			return -1;
		}
		else if(obj1<obj2) return 1;
		else return 0;
		
		
		
	}

}
