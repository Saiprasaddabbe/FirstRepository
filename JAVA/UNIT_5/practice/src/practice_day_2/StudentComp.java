package practice_day_2;

import java.util.Comparator;

public class StudentComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getMarks()>s2.getMarks()) {
			return 1;
		}else if(s1.getMarks()<s2.getMarks()) {
			return -1;
		}
		return 0;
	}

}
