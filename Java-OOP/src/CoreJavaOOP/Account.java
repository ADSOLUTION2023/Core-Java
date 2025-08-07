package CoreJavaOOP;

public class Account {
	private String nameCustomer;
	private String accountNumber;
	private String accountType;
	private double balance;
	
	public String getNameCustomer() {
		return this.nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
