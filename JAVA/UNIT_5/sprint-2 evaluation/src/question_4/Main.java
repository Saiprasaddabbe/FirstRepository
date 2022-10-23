package question_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vivek", "praful", "aman", "suraj", "kartik", "ajay", "binod", "vikash",
				"shubham", "akash");
		
		List<String> originalList =  list.stream()
				                  .filter(n-> n.length() %2==0)
				                  .map(n->n.toUpperCase())
		                          .collect(Collectors.toList());
		
		
		originalList.forEach(x->{
			System.out.println("original list : "+x);
		});

		
        Collections.sort(originalList, (a,b)-> b.compareTo(a));
        
        originalList.forEach(x->{
			System.out.println("tranformed list : "+x);
		});
		


	}

}
