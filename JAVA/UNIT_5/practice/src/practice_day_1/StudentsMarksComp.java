package practice_day_1;

import java.util.Comparator;

public class StudentsMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getMarks()>s2.getMarks() ? +1:-1;
	
	}

}
