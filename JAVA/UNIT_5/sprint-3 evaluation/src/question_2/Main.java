package question_2;

public class Main implements Runnable {

	int result = 1;

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			result *= i;
		}

		synchronized (this) {
			this.notify();
		}

	}

	public static void main(String[] args) {

		Main m1 = new Main();

		Thread t1 = new Thread(m1);
		t1.start();

		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(m1.result);

	}

}
