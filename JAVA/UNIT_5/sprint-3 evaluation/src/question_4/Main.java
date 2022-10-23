package question_4;

public class Main {
	
	

	public static void main(String[] args) throws Exception {


		
		Thread t1 = new Thread(new Dhoni());
		Thread t2 = new Thread(new Kohli());
		Thread t3 = new Thread(new Rohit());
		
		t1.setPriority(10);
		t2.setPriority(6);
		t1.setPriority(7);
		
		t1.start();
		
		synchronized (t1) {
			t1.wait();
		}
		t3.start();
		synchronized (t3) {
			t3.wait();
		}
		t2.start();
		synchronized (t2) {
			t2.wait();
		}
		
		

	}



}
