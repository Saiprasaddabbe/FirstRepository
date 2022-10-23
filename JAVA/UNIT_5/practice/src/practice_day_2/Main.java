package practice_day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student(10,850,"N1"), "Delhi");
		hm.put(new Student(10,750,"N2"), "pune");
		hm.put(new Student(10,950,"N3"), "jal");
		hm.put(new Student(10,250,"N4"), "mumbai");

		String s = hm.get(new Student(10,850,"N1") );
		
		
		
		
		System.out.println(s);
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}