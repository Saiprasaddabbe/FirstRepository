package question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		List<String> cities  =  new ArrayList<>();
		
		cities.add("jalgaon");
		cities.add("pune");
		cities.add("mumbai");
		cities.add("latur");
		cities.add("Ahemdabad");
		
		Collections.sort(cities, ( c1,c2)->c2.compareTo(c1));
		
		for(String s:cities) {
			System.out.println(s);
		}
		
		
	}
}
