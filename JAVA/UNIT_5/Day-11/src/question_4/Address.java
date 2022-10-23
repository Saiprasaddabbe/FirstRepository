package question_4;

import java.io.Serializable;

public class Address implements Serializable {
	String state;
	String city;
	String pincode;
	
	public Address(String state, String city, String pincode) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
