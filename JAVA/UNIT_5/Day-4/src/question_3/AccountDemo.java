package question_3;

public class AccountDemo {
	public static void main(String[] args) {
		Account a1 = new Account("123456789101", 500);
		a1.deposit(100);
		try {
			double bal = a1.withdraw(700);
			System.out.println("remaining balance is :"+ bal);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		
		}


	}
}
