package Practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student s1 = new Student(11, "ravi", 25);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://student.txt"));
		oos.writeObject(s1);

		oos.writeObject(s1);
		oos.close();
		System.out.println("done...");

	}

}
