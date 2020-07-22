package udemyJavaMasterclassAutoxingUnboxing.Challenge;

import java.util.ArrayList;

public class Branch {
	private ArrayList<Customer> customers;
	private String name;
	
	public Branch(String name) {
		this.customers = new ArrayList<Customer>();
		this.name = name;
	}
	
	public boolean newCustomer(String name, double initialAmount){
		if(findCustomer(name) == null){
			this.customers.add(new Customer(name, initialAmount));
			return true;
		}
		return false;
	}
	
	public boolean addTransaction(String name, double amount){
		Customer existingCustomer = findCustomer(name);
		if(existingCustomer != null){
			existingCustomer.addTransaction(amount); 
			return true;
		}
		return false;
	}

	private Customer findCustomer(String name){
		for(int i = 0; i < this.customers.size(); i++){
			Customer customer = this.customers.get(i);
			if(customer.getName().equals(name)){
				return customer;
			}
		}
		return null;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}


	public String getName() {
		return name;
	}
}
