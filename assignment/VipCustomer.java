package assignment;

public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	
	// default
	public VipCustomer(){
		this("Jim", 5000.00, "jim@email.com");
	}
	
	public VipCustomer(String name, String emailAddress){
		this(name, 2000.00, emailAddress);
	}
	
	public VipCustomer(String name, double creditLimit, String emailAddress){
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public double getCreditLimit() {
		return this.creditLimit;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
	
}
