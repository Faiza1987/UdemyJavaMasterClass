package udemyJavaMasterclassArrayList.Challenge1;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {
	private static ArrayList<Contact> contactList;
	
	public MobilePhone(){
		this.contactList = new ArrayList<Contact>();
	}
	
	// add
	public boolean addNewContact(Contact contact){
		int foundContact = findContact(contact);
		if(foundContact >= 0){
			System.out.println("Contact is already on file.");
			return false;
		}
		contactList.add(contact);
		return true;
	}
	
	// search
	private int findContact(Contact contact){
		return this.contactList.indexOf(contact);
	}
	
	public String queryContact(Contact contact){
		if(findContact(contact) >= 0){
			return "Found contact: " + contact.getName() + " with phone number: " + contact.getPhoneNumber();
		}
		return "No contact found";
	}
	
	public Contact queryContact(String name){
		int position = findContact(name);
		if(position >= 0){
			return this.contactList.get(position);
		}
		return null;
	}
	
	private int findContact(String name){
		for(int i = 0; i < this.contactList.size(); i++){
			Contact contact = this.contactList.get(i);
			
			if(contact.getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
	
	// modify
	public boolean modifyContact(Contact oldContact, Contact newContact){
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0){
			System.out.println(oldContact.getName() + " was not found.");
			return false;
		}else if(findContact(newContact.getName()) != -1){
			System.out.println("Contact with name " + newContact.getName() + " already exists. Update was unsuccessful.");
			return false;
		}
		this.contactList.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + " was replaced with " + newContact.getName() + ".");
		return true;
	}
	
	// delete
	public boolean removeContact(Contact contact){
		int position = findContact(contact);
		if(position >= 0){
			this.contactList.remove(position);
			System.out.println(contact.getName() + " with phone number: " + contact.getPhoneNumber() + " was removed");
			return true;
		} 
		return false;
	}
	
	// print contacts
	public void printContacts(){
		for(int i = 0; i < this.contactList.size(); i++){
			System.out.println("Contact " + (i + 1) + ": " + this.contactList.get(i).getName() + " -> "
					+ this.contactList.get(i).getPhoneNumber());
		}
	}
}
