package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter Roll :");
//		int roll = sc.nextInt();
//
//		System.out.println("Enter name :");
//		String name = sc.next();
//
//		System.out.println("Enter marks :");
//		int marks = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}

		String url = "jdbc:mysql://localhost:3306/web19sb101db";

		try (Connection conn = DriverManager.getConnection(url, "root", "root")) {

//			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
//			PreparedStatement ps = conn.prepareStatement("update student set marks=marks+30 where marks<800");
			PreparedStatement ps = conn.prepareStatement("select * from student");

//			ps.setInt(1, roll);
//			ps.setString(2, name);
//			ps.setInt(3, marks);
//			ps.setInt(3, marks);

//			int x = ps.executeUpdate();
			ResultSet rs = ps.executeQuery();

//			if (x > 0)
//				System.out.println("Record Inserted Sucessfully");
//			else
//				System.out.println("Not inserted...");
			while(rs.next()) {
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int marks = rs.getInt("marks");
				System.out.println("roll : "+ r);
				System.out.println("name : "+ n);
				System.out.println("marks : "+ marks);
				System.out.println("----------");
			}
			
			

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
