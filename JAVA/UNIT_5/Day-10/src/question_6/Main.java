package question_6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {

		MyCallable[] jobs = { new MyCallable(1), new MyCallable(2), new MyCallable(3), new MyCallable(4),
				new MyCallable(5), new MyCallable(6) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable job : jobs) {
			Future<Integer> ans = service.submit(job);
			try {
				System.out.println(ans.get()+4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (ExecutionException e) {
				
				e.printStackTrace();
			}
		}
		service.shutdown();

	}

}
