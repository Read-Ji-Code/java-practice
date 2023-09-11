package com.ruby.java.ch07.abstraction;

public class MessengerTest {
public static void main(String[] args) {
	IPhoneMessenger iphone = new IPhoneMessenger();
	iphone.setLogin(false);
	iphone.getMessage();
	iphone.setMessage(null);
	Messenger.getConnection();
	iphone.getConnection();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
