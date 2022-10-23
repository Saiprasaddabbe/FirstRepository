package question_4;

import java.util.ArrayList;
import java.util.List;

public class PrintListImpl {



	public static void main(String[] args) {
           
		List<String> cities = new ArrayList<>();
		cities.add("jalgaon");
		cities.add("pune");
		cities.add("baglore");
		cities.add("mumbai");
		cities.add("delhi");
		
		
		
		PrintList pl1 = (c1)->{
			for(String c : c1) {
				System.out.println(c);
			}
		};
		
		pl1.display(cities);
		
		
	}
}
