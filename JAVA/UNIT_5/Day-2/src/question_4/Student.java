package question_4;

public class Student implements Comparable<Student> {

	private int roll;
	private String name;
	private int marks;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}



	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public int compareTo(Student o) {
		
		return this.getMarks()>o.getMarks()?+1:-1;
	}
	
	
	
	
}