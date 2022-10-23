package queston_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		File f = new File("d:\\abc.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter name...");
			String name = sc.next();
			System.out.println("Enter address..");
			String address = sc.next();
			bw.write(name);
			bw.newLine();
			bw.write(address);
			bw.flush();
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}

}
