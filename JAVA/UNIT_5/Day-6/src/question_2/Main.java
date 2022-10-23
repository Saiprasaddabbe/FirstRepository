package question_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = n->n%2==0;
		System.out.println(p1.test(10));
		
		Supplier<Student> s1 =  ()->new Student();
		System.out.println(s1);
		
		Consumer<String> c1 = (a)->{
			System.out.println(a);
		};
		String a = "Sai";
		c1.accept(a);
		
		

//		Consumer
//		Function

	}

}
