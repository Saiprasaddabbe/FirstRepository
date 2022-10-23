package practice_day_6;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student> {

	@Override
	public boolean test(Student s) {
		// TODO Auto-generated method stub
		return s.marks>500;
	}

}
