package CoreJavaOOP;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account ();
		a.setNameCustomer("Amit Chandsarkar");
		a.setAccountNumber("98673562756");
		a.setAccountType("Saving");
		a.setBalance(20000.00);
		
		System.out.println("Customer Name :- " + a.getNameCustomer());
		System.out.println("Account Number :- " + a.getAccountNumber());
		System.out.println("Account Type :- " + a.getAccountType());
		System.out.println("Account Balance :- " + a.getBalance());
	}
}
