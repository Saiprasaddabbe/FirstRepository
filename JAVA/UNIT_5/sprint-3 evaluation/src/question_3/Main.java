package question_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Product[] jobs = {new Product(1),new Product(2), new Product(3),new Product(5),new Product(6)};
	
		for(Product job:jobs) {
			try {
				Future<Integer> ans = service.submit(job);
				System.out.println(ans.get());
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}
		service.shutdown();

	}

}
