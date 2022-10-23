package com.question_3;

import java.util.Comparator;

public class MemberId implements Comparator<Member> {

	@Override
	public int compare(Member m1, Member m2) {
		if (m1.memberId > m2.memberId && m1.membershipNo > m2.membershipNo) {
			return 1;

		}else if(m1.memberId < m2.memberId && m1.membershipNo < m2.membershipNo) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
