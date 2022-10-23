package question_3;

public class ThreadB extends Thread {
	Thread tr;

	public ThreadB(ThreadA tr) {
		this.tr = tr;
	}

	@Override
	public void run() {
		
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd " + i);
			}
		}

	}
}
