package assignment;

public class BankAccount {
	private String accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNumber;

	// Constructors
	public BankAccount(){
		// default values
		this("56789", 100.00, "Default Name", "Default email address", "Default phone number");
		System.out.println("Empty Constructor called");
	}
	
	public BankAccount(String accountNumber, double accountBalance, String customerName, 
		String customerEmail, String customerPhoneNumber){
		
			this.accountNumber = accountNumber;
			this.accountBalance = accountBalance;
			this.customerName = customerName;
			this.customerEmail = customerEmail;
			this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public BankAccount(String customerName, String customerEmail, String customerPhoneNumber){
		this("999999", 100.55, customerName, customerEmail, customerPhoneNumber);
	}
	
	// Getters
	public String getAccountNumber(){
		return this.accountNumber;
	}
	public double getAccountBalance(){
		return this.accountBalance;
	}
	public String getCustomerName(){
		return this.customerName;
	}
	public String getCustomerEmail(){
		return this.customerEmail;
	}
	public String getCustomerPhoneNumber(){
		return this.customerPhoneNumber;
	}
	
	// Setters
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountBalance(double accountBalance){
		this.accountBalance = accountBalance;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public void setCustomerEmail(String customerEmail){
		this.customerEmail = customerEmail;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber){
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	// Methods
	public void deposit(double depositAmount){
		this.accountBalance += depositAmount;
	}
	
	public void withdraw(double withdrawalAmount){
		if(this.accountBalance - withdrawalAmount < 0 || this.accountBalance < withdrawalAmount){
			System.out.println("Insufficient Funds");
		} else {			
			this.accountBalance -= withdrawalAmount;
		}
	}
}
