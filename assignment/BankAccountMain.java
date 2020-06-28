package assignment;

public class BankAccountMain {
	public static void main(String[] args){
		
		BankAccount defaultAccount = new BankAccount();
//		System.out.println("Account Number: " + defaultAccount.getAccountNumber());
//		System.out.println("Account Balance: $" + defaultAccount.getAccountBalance());
//		System.out.println("Customer Name: " + defaultAccount.getCustomerName());
//		System.out.println("Customer Email: " + defaultAccount.getCustomerEmail());
//		System.out.println("Customer Phone Number: " + defaultAccount.getCustomerPhoneNumber());
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		BankAccount myAccount = new BankAccount("1234567890", 20000.00, "Jane Doe", "jdoe@email.com", "098-765-4321");
		
//		System.out.println("Account Number: " + myAccount.getAccountNumber());
//		System.out.println("Account Balance: $" + myAccount.getAccountBalance());
//		System.out.println("Customer Name: " + myAccount.getCustomerName());
//		System.out.println("Customer Email: " + myAccount.getCustomerEmail());
//		System.out.println("Customer Phone Number: " + myAccount.getCustomerPhoneNumber());
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		myAccount.withdraw(100.00);
//		System.out.println("Account Balance after withdrawal: $" + myAccount.getAccountBalance());
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		myAccount.deposit(10000.00);
//		System.out.println("Account Balance after deposit: $" + myAccount.getAccountBalance());
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		myAccount.withdraw(500.00);
//		System.out.println("Account Balance after withdrawal: $" + myAccount.getAccountBalance());
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		myAccount.withdraw(50000.00);
//		System.out.println("Account Balance after withdrawal: $" + myAccount.getAccountBalance());
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
//		BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "123456");
//		System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
		
		VipCustomer vipCust1 = new VipCustomer();
		System.out.println(vipCust1.getName());
		System.out.println(vipCust1.getCreditLimit());
		System.out.println(vipCust1.getEmailAddress());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		VipCustomer vipCust2 = new VipCustomer("Bob", 2500.00, "bob@email.com");
		System.out.println(vipCust2.getName());
		System.out.println(vipCust2.getCreditLimit());
		System.out.println(vipCust2.getEmailAddress());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		VipCustomer vipCust3 = new VipCustomer("Tom", 7000.00, "tom@email.com");
		System.out.println(vipCust3.getName());
		System.out.println(vipCust3.getCreditLimit());
		System.out.println(vipCust3.getEmailAddress());
		
	}
}
