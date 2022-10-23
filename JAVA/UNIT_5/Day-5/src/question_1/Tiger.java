package question_1;

public class Tiger extends Animal{

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() throws AnimalException {
		System.out.println("Tiger is Eating!!");
		
	}
	public static void main(String[] args) {
		try {
			Animal a = new Tiger();
			a.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
