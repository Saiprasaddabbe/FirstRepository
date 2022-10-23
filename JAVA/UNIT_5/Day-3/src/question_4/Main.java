package question_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
     TreeMap<String, List<String>> m = new TreeMap<>();
     m.put("Andhra Pradesh", Arrays.asList("Visakhapatnam","Vijayawada","Guntur","Nellore"));
     m.put("Maharashtra", Arrays.asList("Pune","Mumbai","Jalgaon","Buldhana","Akola"));
     m.put("Rajasthan", Arrays.asList("Jaisalmer","sikar","Pali","Udaipur","Ajmer"));
     m.put("Madhya Pradesh", Arrays.asList("sagar","Kanti","Bhopal","Indore","Jabalpur"));
     
    Set<Entry<String, List<String>>> se = m.entrySet();
    
    for(Entry<String, List<String>> a: se) {
    	System.out.println(a.getKey()+"==>>"+a.getValue());
    	System.out.println("------------");
    }
     
     

     
     
     
	}
	
	
	
	

}
