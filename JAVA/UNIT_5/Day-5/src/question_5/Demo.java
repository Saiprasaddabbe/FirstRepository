package question_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	
	
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(11,"Shoes",5,299));
		products.add(new Product(12,"jeans",4,399));
		products.add(new Product(13,"shirt",3,499));
		products.add(new Product(14,"jacket",2,599));
		products.add(new Product(15,"blazer",1,699));
		
		Collections.sort(products, (p1,p2) -> p1.getPrice() < p2.getPrice() ? +1: -1);
		
	
				
		for(Product p:products) {
			System.out.println(p);
		}
				
				
				
	}
}
