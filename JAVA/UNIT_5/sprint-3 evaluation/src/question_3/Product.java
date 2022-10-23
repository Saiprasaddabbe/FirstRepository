package question_3;

import java.util.concurrent.Callable;

public class Product implements Callable<Integer> {
	int n;

	public Product(int n) {
		this.n = n;
	}

	@Override
	public Integer call() throws Exception {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result*=i;
		}
		return result;
	}

}
