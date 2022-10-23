package question_3;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Andhra Pradesh", "Amaravati");
		lhm.put("Arunachal Pradesh", "Itanagar");
		lhm.put("Assam", "Dispur");
		lhm.put("Bihar", "Patna");
		lhm.put("Chhattisgarh", "Raipur");
		lhm.put("Goa", "Panaji");
		
		for(Map.Entry<String, String> m:lhm.entrySet()) {
			System.out.println("State "+m.getKey()+" and Capital is "+m.getValue());
		}
		
	}

}