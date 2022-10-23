package com.Q2;

import java.util.*;
import java.util.*;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	 
	public String  addMobile(String company, String model) {
		
		List<String> a = new ArrayList<String>();
		a.add(model);
		a.add(model);
		a.add(model);
		    
		mobiles.put(company, (ArrayList<String>) a);
		
		System.out.println("Mobile added successfully");
		
		
		return model;
		
	}
	public List<String> getModels(String company){
		return null;
		
	}
	public static void main(String[] args) {
		
		Mobile m = new  Mobile();
		
		
		m.addMobile("Apple","Iphone13");
		m.addMobile("Apple","Iphone12");
		m.addMobile("Apple","Iphone14");
	}

}
