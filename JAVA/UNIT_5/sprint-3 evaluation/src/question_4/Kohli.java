package question_4;

public class Kohli implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Kohli is printing 1 to 10..");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
			this.notify();
		}
		

	}

}
