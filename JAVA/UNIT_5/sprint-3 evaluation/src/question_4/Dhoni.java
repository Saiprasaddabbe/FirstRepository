package question_4;

public class Dhoni implements Runnable {

	@Override
	public void run() {
		
		synchronized (this) {
			int sum = 0;
			for(int i=1;i<=20;i++) {
				sum+=i;
			}
			System.out.println("Dhoni is printing addition 1 to 20. "+sum);
			this.notify();
		}
		
		
		
	}

}
