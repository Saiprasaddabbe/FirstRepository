package question_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;


//JDBC application to take the Student roll number from the user and print all
//course details in which he has enrolled.


public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter  student roll number..");
	    int roll =sc.nextInt();
	    
	    
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("problem with loading the driver related main class");
		}
	    
	    
	    String url = "jdbc:mysql://localhost:3306/C4_evaluation";
	    try (Connection conn = DriverManager.getConnection(url, "root", "root")){
	    	PreparedStatement ps = conn.prepareStatement("select * from student_course where roll=?");
	    	ps.setInt(1, roll);
	
	    	ResultSet rs = ps.executeQuery();
	    	boolean flag = true;
	    	
	    	
	    	
	    	while(rs.next()) {
	    		flag=true;
	    		System.out.println("course id :-" + rs.getInt("cid"));
	    		System.out.println("course name :-" +rs.getString("cname"));
	    		System.out.println("course fees :-" +rs.getInt("fee"));
	    		System.out.println("course duration :-" + rs.getString("duration"));
	    		System.out.println("=========================================");
	    	}
	    	
	    	if(flag==false) {
	    		System.out.println("No record found");
	    	}
	    	
	    	

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	    
	    

	}

}


