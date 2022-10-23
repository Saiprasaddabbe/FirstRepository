package practice_day_6;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student t) {
      System.out.println(t.marks);
      System.out.println(t.name);
      System.out.println(t.roll);
	}

}
