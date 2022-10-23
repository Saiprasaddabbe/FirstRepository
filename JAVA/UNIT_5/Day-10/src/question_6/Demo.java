package question_6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(3);

		MyCall[] jobs = { new MyCall(2), new MyCall(4), new MyCall(3), new MyCall(11), new MyCall(15), new MyCall(1) };

		for (MyCall job : jobs) {
		 Future<String> ans = service.submit(job);
		 System.out.println(ans.get());
		}

	}

}
