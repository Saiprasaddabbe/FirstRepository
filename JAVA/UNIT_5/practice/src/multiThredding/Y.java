package multiThredding;

public class Y implements Runnable{

	@Override
	public void run() {
	
		Comon c1 = new Comon();
		System.out.println("thread y");
		c1.fun();
	
	}
	
	

}
