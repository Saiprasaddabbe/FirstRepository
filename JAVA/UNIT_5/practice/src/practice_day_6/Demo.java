package practice_day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList((new Student(11, 500, "N1")), (new Student(11, 510, "N2")),
				(new Student(11, 110, "N3")), (new Student(11, 200, "N4")), (new Student(11, 300, "N5")));

		Stream<Student> str1 = students.stream();
		Optional<Student> opt =  str1.min((s1,s2) ->s1.marks>s2.marks? 1:-1);
		System.out.println(opt.get());
		
		
	}
}
