package udemyJavaMasterclassAutoxingUnboxing.Challenge;

import java.util.ArrayList;

public class Customer {
	private static ArrayList<Double> transactions;
	private String name;
	
	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public void addTransaction(double amount){
		this.transactions.add(amount);
	}
	
	public static ArrayList<Double> getTransactions() {
		return transactions;
	}

	public static void setTransactions(ArrayList<Double> transactions) {
		Customer.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
