package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookData {
	  int id ;
	  String bookName;
	  
	public AddressBookData(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "AddressBookData [id=" + id + ", bookName=" + bookName + "]";
	}
}