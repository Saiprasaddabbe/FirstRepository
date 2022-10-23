package question_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Parent {
String name;

public Main(String name) {
		this.name=name;
	}

//	Q1) Create a Main class inside this create one generic method which will only accept list of its
//	equivalent or Parent class, this method will return a generic list. Also print the list.

	public static List<?> fun(List<? extends Parent> list) {
		System.out.println("inside fun of main");
		
		
		
		for(Parent a:list) {
			System.out.println(a.name);
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		List<Parent> lp = new ArrayList<>();
		System.out.println("Enter parent name: ");
		String name = sc.next();
		Parent p = new Parent(name);
		lp.add(p);
		
		List<Parent> ml = new ArrayList<>();
		System.out.println("Enter Main name: ");
		String name2 = sc.next();
	    Main m = new Main(name);
	    ml.add(m);
	    
	    
	    fun(ml);
	    fun(lp);
		

	}

}
