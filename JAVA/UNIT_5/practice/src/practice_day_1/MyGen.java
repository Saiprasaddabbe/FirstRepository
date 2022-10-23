package practice_day_1;

public class MyGen <TYPE extends Person>{

	TYPE data;

	public MyGen(TYPE data) {
		this.data = data;
	}
	
	public TYPE  getData() {
		return data;
	}
}
