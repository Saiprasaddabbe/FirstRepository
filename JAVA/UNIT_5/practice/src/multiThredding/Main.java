package multiThredding;

public class Main  {

	public static void main(String[] args){
		
		Runnable task = ()->System.out.println("Hello world");
		
		Thread thread = new Thread(task);
		thread.start();
		
		
		
		
	}

}
