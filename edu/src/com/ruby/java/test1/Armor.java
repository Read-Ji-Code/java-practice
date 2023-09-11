package com.ruby.java.test1;


public class Armor {
	void test(String name, int... v) {
		System.out.println(v.length + " : ");
	}
	public void speedUp(double value) {
		double speed = value;
	}
	public void speedUp(int value) {
		int speed = value;
	}
	public void speedUp(int value, int maxValue) {
		int speed = value;
		int maxSpeed = maxValue;
	}
	
	void takeOff() {
		speedUp(10);
		speedUp(10, 20);
		
	}
}
