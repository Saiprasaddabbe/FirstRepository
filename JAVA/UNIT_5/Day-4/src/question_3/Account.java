package question_3;

public class Account {
	String accountNumber;
	 double balance;
	 
	 
	 public Account(String accountNumber , double balance) {
	   this.accountNumber=accountNumber;
	   this.balance=balance;
	}
	 
	 
	 
	 
	 public void deposit(int amount) {
		 this.balance+=amount;
	 }
	 
	 public double withdraw(int amount) throws InsufficientFundsException{
		 if(this.balance>amount) {
			 
			 this.balance-=amount;
			 return this.balance;
		 }
		 InsufficientFundsException ife = new InsufficientFundsException("Insufficient funds");
		 throw ife;
		 
	 }


}
