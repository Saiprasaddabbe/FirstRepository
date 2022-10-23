package question_7;

public class RunThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			String tName = Thread.currentThread().getName();
			int tPriority = Thread.currentThread().getPriority();
            
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread name is " + tName + " And Priority is " + tPriority);

		}
	}

	public static void main(String[] args) {
		
		RunThread job = new RunThread();
		
		Thread one = new Thread(job);  
		Thread two = new Thread(job);
		
		one.setName("Dhoni");
		two.setName("Kohli");
		
		one.setPriority(8);
		two.setPriority(10);
		
		
		one.start();
		two.start();
	}
}
