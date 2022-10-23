package Practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		A a1 = new A();
		A a2 = new A();
		List<A> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://obj1.txt"));
		oos.writeObject(list);
		
		
		oos.close();
		System.out.println("done");

	}

}
