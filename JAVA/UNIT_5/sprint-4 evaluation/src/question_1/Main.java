package question_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//Note :- Use this class to insert new student..

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter student name..");
	    String name =sc.next();
	    
	    System.out.println("Enter student roll..");
	    int roll =sc.nextInt();
	    
	    System.out.println("Enter student address..");
	    String address =sc.next();
	    
	    System.out.println("Enter student mobile..");
	    String mobile =sc.next();
	    
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("problem with loading the driver related main class");
		}
	    
	    
	    String url = "jdbc:mysql://localhost:3306/C4_evaluation";
	    try (Connection conn = DriverManager.getConnection(url, "root", "root")){
	    	PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
	    	ps.setInt(1, roll);
	    	ps.setString(2, name);
	    	ps.setString(3, address);
	    	ps.setString(4, mobile);
	    	
	    	int x = ps.executeUpdate();
	    	if(x>0) {
	    		System.out.println("record inserted successfully");
	    	}else {
	    		System.out.println("record is not inserted");
	    	}
	    	
	    	
	    	
			
		} catch (Exception e) {
			
		}
	    
	    
	    

	}

}
