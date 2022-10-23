package question_4;

public class Rohit implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			int product = 1;
			for(int i=1;i<=10;i++) {
				product*=i;
			}
			System.out.println("Rohit is printing product of 1 to 10. "+product);
			this.notify();
			
		}
	}

}
