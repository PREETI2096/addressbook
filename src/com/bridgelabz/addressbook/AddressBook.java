package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
	static ArrayList<AddressBookData> addressList = new  ArrayList<AddressBookData>();
	static HashMap <String, ArrayList<Contact>> hashmap = new HashMap<String,ArrayList<Contact>>();
	boolean result;
	public void addContact() {
		System.out.println("Enter first name : ");
		String firstName = sc.next();
		System.out.println("Enter last name : ");
		String lastName = sc.next();
		System.out.println("Enter address : ");
		String address = sc.next();
		System.out.println("Enter city: ");
		String city = sc.next();
		System.out.println("Enter state: ");
		String state = sc.next();
		System.out.println("Enter zip : ");
		int zipcode = sc.nextInt();
		System.out.println("Enter contact number : ");
		long mobileNo = sc.nextLong();
		System.out.println("Enter email id : ");
		String emailID = sc.next();
		contactArrayList.add(new Contact(firstName, lastName, address, city, state, zipcode, mobileNo, emailID));
	    return ;
	}
	public void displayContact() {
			System.out.println(contactArrayList);
	}

    public void editContact(){
        System.out.println("Enter person name : ");
        String name = sc.next();
        for(Contact contact : contactArrayList){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                System.out.println("What you want to edit : \n" +
                        "1.first name \t" +
                        "2.last name \t" +
                        "3.address \t" +
                        "4.city \t" +
                        "5.state \t" +
                        "6.zipcode \t" +
                        "7.moblie number \t" +
                        "8.emailID");
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("Enter first name :");
                        contact.setFirstName(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 2:
                        System.out.println("Enter last name :");
                        contact.setLastName(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 3:
                        System.out.println("Enter street :");
                        contact.setAddress(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 4:
                        System.out.println("Enter city :");
                        contact.setCity(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 5:
                        System.out.println("Enter state :");
                        contact.setState(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 6:
                        System.out.println("Enter zip code :");
                        contact.setZipCode(sc.nextInt());
                        System.out.println("Contact updated!");
                        break;
                    case 7:
                        System.out.println("Enter contact number :");
                        contact.setMobileNo(sc.nextInt());
                        System.out.println("Contact updated!");
                        break;
                    case 8:
                        System.out.println("Enter email :");
                        contact.setEmailID(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
                return;
            }
        }
        System.out.println(name + " not found!");
    }
	public void deleteContact() {
		System.out.println("Enter the First Name to DELETE from address book : ");
		String FirstName = (sc.next());
		boolean IsAvaible = false;

		for (Contact contact : contactArrayList) {
			if (contact.getFirstName().equalsIgnoreCase(FirstName)) {
				IsAvaible = true;
				contactArrayList.remove(contact);
				System.out.println("CONTACT IS DELETED");
				break;
			}
		}
		if (IsAvaible == false) {
			System.out.println("CONTACT NOT AVAIBLE");
		}
	}
	public void multipleContact() {
		System.out.println(" Please enter how many contacts you want to add: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			addContact();
		}
	}
	 public void addAddressBook() {
	        System.out.println("Enter id : ");
	        int id = sc.nextInt();
	        System.out.println("Enter name : ");
	        String bookName = sc.next();
	        AddressBookData book = new AddressBookData(id, bookName);

	        if (addressList.isEmpty()) {
	            addressList.add(book);
	           hashmap.put(bookName, contactArrayList);
	            System.out.println("New record added  : ");
	        } else {
	            for (int i = 0; i < addressList.size(); i++) {
	                if (addressList.get(i).getBookName().equals(bookName)) {
	                    result = addressList.get(i).getBookName().equals(bookName);
	                    System.out.println("Record is already exists : ");
	                    break;
	                }
	            }
	            if (!result) {
	                addressList.add(book);
	                hashmap.put(bookName, contactArrayList);
	                System.out.println("Record added successfully : ");
	            }
	        }
}
}