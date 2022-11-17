package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to address book system program....");
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		
			System.out.println("0.Exit \n1.Add Contact \n2.multiple contact \n3.Display Contact \n4.Edit \n5.delete ");
			System.out.println("Enter the Operation Number : ");
			int operationNumber = sc.nextInt();
            do {
			switch (operationNumber) {

			case 0:
				System.exit(0);
				break;
			case 1:
				addressBook.addContact();
				break;		
			case 2:
				addressBook.multipleContact();
				break;
			case 3:
				addressBook.displayContact();
				break;
				
			case 4:
				addressBook.editContact();
				break;
			case 5:
			addressBook.deleteContact();
			break;
			
			default:
				System.out.println("Invalid Input");
			}
		}while(operationNumber != 5);
	}

}
