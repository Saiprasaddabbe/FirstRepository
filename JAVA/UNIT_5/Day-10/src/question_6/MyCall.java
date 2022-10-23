package question_6;

import java.util.concurrent.Callable;

public class MyCall implements Callable<String> {
	int num;

	public MyCall(int num) {
		this.num = num;
	}

	@Override
	public String call() throws Exception {

		if(num%2==0) {
			
			return "Even Number";
		}
		return "Odd Number";
		
	}

}
