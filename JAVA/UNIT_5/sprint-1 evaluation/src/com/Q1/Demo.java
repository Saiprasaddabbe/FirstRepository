package com.Q1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		Set<Map.Entry<Employee, String>> set = originalMap.entrySet();
		List<Map.Entry<Employee, String>> list = new LinkedList<Map.Entry<Employee,String>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<Employee, String>>(){

			@Override
			public int compare(Map.Entry<Employee, String> s1, Map.Entry<Employee, String> s2) {
				// TODO Auto-generated method stub
				return s1.getKey().compareTo(s2.getKey());
			}
			
		});
		
		Map<Employee, String> hm1 = new LinkedHashMap<Employee,String>();
		for(Map.Entry<Employee, String> x:list) {
		hm1.put(x.getKey(), x.getValue());
		
		}
		return hm1;
		
		
		
		
		

	
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		
		HashMap<Employee, String> em = new HashMap<>();
		
		em.put(new Employee(1,"name1",12000), "Employee-1" );
		em.put(new Employee(2,"name2",13000), "Employee-2" );
		em.put(new Employee(3,"name3",18000), "Employee-3" );
		em.put(new Employee(4,"name4",11000), "Employee-4" );
		em.put(new Employee(5,"name5",37000), "Employee-5" );
		
		
		Map<Employee , String > newMap = d1.sortMapUsingEmployeeSalary(em);
		for(Map.Entry<Employee, String > en:newMap.entrySet()) {
			System.out.println(en.getValue()+" ======> "+en.getKey());
		}
		
		
		
	}
	
}
