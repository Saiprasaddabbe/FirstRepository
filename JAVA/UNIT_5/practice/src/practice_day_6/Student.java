package practice_day_6;

public class Student {
int roll;
int marks;
String name;
public Student(int roll, int marks, String name) {
	super();
	this.roll = roll;
	this.marks = marks;
	this.name = name;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
}

}
