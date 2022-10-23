package question_4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Student> list = new ArrayList<>();
		list.add(new Student(11, "N1", 750, new Address("state1", "city1", "12345")));
		list.add(new Student(12, "N2", 650, new Address("state2", "city2", "42345")));
		list.add(new Student(13, "N3", 450, new Address("state3", "city3", "52345")));
		list.add(new Student(14, "N4", 750, new Address("state4", "city4", "62345")));
		list.add(new Student(15, "N5", 850, new Address("state5", "city5", "72345")));
		list.add(new Student(15, "N5", 850, new Address("state5", "city5", "72345")));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		oos.writeObject(list);
		oos.close();
		
		
	}

}
