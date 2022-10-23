package question_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Student> students =Arrays.asList(
				new Student(11, "N1", 780, "Address1"),
				new Student(12, "N2", 680, "Address2"),
				new Student(13, "N3", 480, "Address3"),
				new Student(14, "N4", 750, "Address4"),
				new Student(15, "N5", 790, "Address5"));

		List<Employee> employees =students.stream()
				                          .filter(s-> s.getMarks()>500)
				                          .map(s->new Employee(s.getRoll(),s.getName(), s.getMarks()*10000, s.getAddress()))
                                          .collect(Collectors.toList());
		
		employees.forEach((e)->System.out.println(e));
	}

}
