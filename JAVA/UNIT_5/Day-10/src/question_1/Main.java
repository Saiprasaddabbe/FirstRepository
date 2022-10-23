package question_1;

public class Main implements Runnable {

	int product = 1;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				product *= i;
				
			}
			this.notify();
		}

	}

	public static void main(String[] args) throws Exception {

		Main m1 = new Main();
		Thread t1 = new Thread(m1);

		t1.start();
		synchronized (t1) {
			t1.wait();
			System.out.println(m1.product);
		}

	}

}
