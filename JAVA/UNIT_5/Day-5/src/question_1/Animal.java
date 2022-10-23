package question_1;

public abstract class Animal {

	abstract void eat()throws AnimalException;
	public Animal()throws AnimalException {
		AnimalException ae = new AnimalException();
		throw ae;
	}
}
