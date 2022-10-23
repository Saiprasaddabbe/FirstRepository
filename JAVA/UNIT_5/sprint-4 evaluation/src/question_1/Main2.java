package question_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


//Note:- Use this class to insert a new course..


public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter course id cid..");
	    int cid =sc.nextInt();
	    
	    System.out.println("Enter course name cname..");
	    String cname =sc.next();
	    
	    System.out.println("Enter course fee..");
	    int fee =sc.nextInt();
	    
	    System.out.println("Enter course duration ..");
	    String duration =sc.next();
	    
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("problem with loading the driver related main class");
		}
	    
	    
	    String url = "jdbc:mysql://localhost:3306/C4_evaluation";
	    try (Connection conn = DriverManager.getConnection(url, "root", "root")){
	    	PreparedStatement ps = conn.prepareStatement("insert into course values(?,?,?,?)");
	    	ps.setInt(1, cid);
	    	ps.setString(2, cname);
	    	ps.setInt(3, fee);
	    	ps.setString(4, duration);
	    	
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

