package practice_day_6;

import java.util.function.Function;

public class MyFunction implements Function<Student, String> {

	@Override
	public String apply(Student s) {
		return s.marks>500 ? "Pass":"Fail";
	}

}
