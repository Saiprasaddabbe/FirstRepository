package question_5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	//Note :- Intentionally adding throws to the main method for better readability of code..
	public static void main(String[] args) throws IOException {
	List<Student> list = new ArrayList<>();
	list.add(new Student(11, "N1", 780, "N1@gmail.com", "pass1235", new Address("state1", "city1", "425001")));
	list.add(new Student(12, "N2", 880, "N2@gmail.com", "pass1233", new Address("state2", "city2", "425002")));
	list.add(new Student(13, "N3", 980, "N3@gmail.com", "pass1231", new Address("state3", "city3", "425003")));
	list.add(new Student(14, "N4", 180, "N4@gmail.com", "pass1232", new Address("state4", "city4", "425004")));
	list.add(new Student(15, "N5", 280, "N5@gmail.com", "pass1239", new Address("state5", "city5", "425005")));
	
	//adding extra student to the list after deseralization.
	list.add(new Student(16, "N6", 880, "N6@gmail.com", "pass1639", new Address("state6", "city6", "425905")));
	//again serializing
	
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
	oos.writeObject(list);
	oos.close();
	System.out.println("serialization done");
	
	

	}

}
