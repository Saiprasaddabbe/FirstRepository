package question_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main4 {

	
	//Write a JDBC application to take a Course name from the user and print all the
	//Student details who enrolled in that course
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter  course name..");
	    String course =sc.next();
	    
	    
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("problem with loading the driver related main class");
		}
	    
	    
	    String url = "jdbc:mysql://localhost:3306/C4_evaluation";
	    try (Connection conn = DriverManager.getConnection(url, "root", "root")){
	    	PreparedStatement ps = conn.prepareStatement("select * from student_course where cname=?");
	    	ps.setString(1,course );
	
	    	ResultSet rs = ps.executeQuery();
	    	boolean flag = true;
	    	while(rs.next()) {
	    		flag=true;
	    		System.out.println("student id :-" + rs.getInt("roll"));
	    		System.out.println("student name :-" +rs.getString("name"));
	    		System.out.println("student address :-" +rs.getString("address"));
	    		System.out.println("student mobile :-" + rs.getString("mobile"));
	    		System.out.println("=========================================");
	    	}
	    	
	    	if(flag== false) {
	    		System.out.println("No record found");
	    	}
	    	
	    	

			
		} catch (Exception e) {
			System.out.println(e.getMessage()+"..");
		}
	    
	    
	    

	}

	}


