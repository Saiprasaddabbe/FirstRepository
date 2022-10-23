package multiThredding;

public class X implements Runnable{


	@Override
	public void run() {
		Comon c1 = new Comon();
		System.out.println("thread x");
		c1.fun();
	}
	
}