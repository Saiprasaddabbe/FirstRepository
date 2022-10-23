package question_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Predicate<Student> p_students = s->s.getMarks()<500;
		
		Consumer<Student>  c_students = s->System.out.println(s);
		c_students.accept(new Student(11,"N2",850));
		
		Supplier<Student>  s_students = ()-> new Student(11,"N1",750);
		System.out.println(s_students.get());
		
		
		Function<String, Integer> f_student = (s)->Integer.parseInt(s);
		System.out.println(f_student.apply("10")+10);
			
	
	
		
		

	}

}
