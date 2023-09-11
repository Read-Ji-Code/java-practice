package com.ruby.java.ch08.innerClass;
public class GalaxyMessenger implements Messenger {
	public String getMessage() {
		return "galaxy";
	}
	public void setMessage(String msg) {
		System.out.println("갤럭시 메시지" + msg);
	}

}
public class MessengerTest {
	public static void main(String[] args) {
		GalaxyMessenger galaxy = new GalaxyMessenger();
		galaxy.getMessage();
		galaxy.setMessage("hi");
		
	}
}
