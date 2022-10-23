package question_4;
import java.util.*;


public class Main {

	public static void main(String[] args) {

		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("mumbai", new Student(10,"n1",790));
		hm.put("chennai", new Student(10,"n2",123));
		hm.put("delhi", new Student(10,"n3",600));
		hm.put("banglore", new Student(10,"n4",230));
		hm.put("pune", new Student(10,"n5",745));
		hm.put("bombay", new Student(10,"n6",100));

		  

			Set<Map.Entry<String, Student>> set =hm.entrySet();
		
			
			
			List<Map.Entry<String, Student>> list = new LinkedList<Map.Entry<String, Student>>(set);
			
			Collections.sort(list,new Comparator<Map.Entry<String, Student>>(){
				
				public int compare(Map.Entry<String, Student> s1,Map.Entry<String, Student> s2) {
					
					return s1.getValue().compareTo(s2.getValue());
				}
			});
			
			Map<String, Student> hmm = new LinkedHashMap<String, Student>();
			
			for(Map.Entry<String, Student> mm: list) {
				hmm.put(mm.getKey(),mm.getValue());
			}
			
			  for (Map.Entry<String, Student> en : hmm.entrySet()) {
		          System.out.println("Key = " + en.getKey() +
		                        ", Value = " + en.getValue());
		      }
			
			
		
		
		
	}

}