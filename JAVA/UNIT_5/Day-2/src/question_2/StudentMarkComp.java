package question_2;


import java.util.Comparator;

public class StudentMarkComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
		return o1.getMark()>o2.getMark()?+1:-1;
	}

}