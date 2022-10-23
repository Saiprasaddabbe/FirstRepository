package question_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {
     //Note :- Intentionally adding throws to the main method for better readability of code..
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://studentdata.txt"));
		List<Student> list =  (List<Student>) ois.readObject();
		
		System.out.println("deserialization done");
		for(Student s:list) {
			System.out.println(s);
		}
		
		

	}

}
