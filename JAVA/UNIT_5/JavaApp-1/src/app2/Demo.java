package app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks to sarch :");
		int marks = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}

		String url = "jdbc:mysql://localhost:3306/web19sb101db";

		try (Connection conn = DriverManager.getConnection(url, "root", "root")) {

			PreparedStatement ps = conn.prepareStatement("select * from student where marks<?");

			ps.setInt(1, marks);

			ResultSet rs = ps.executeQuery();

			boolean flag = true;
			
			
			while (rs.next()) {
			flag = true;
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int marks1 = rs.getInt("marks");
				System.out.println("roll : " + r);
				System.out.println("name : " + n);
				System.out.println("marks : " + marks1);
				System.out.println("----------");
			}
		   if(flag) {
			   
			   System.out.println("no record");
		   }

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
