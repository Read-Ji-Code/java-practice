package com.ruby.java.ch08.polymorphism;
//polymorphism 실습 예제 코드

abstract class Vehicle {
	String engineType;
	int numberWheels;
	
	public Vehicle(String engineType, int numberWheels) {
		this.engineType = engineType;
        this.numberWheels = numberWheels;
	}
	public abstract void displayWheels();
	}


class Truck extends Vehicle {
	int weight;
	public Truck(String engineType, int numberWheels, int weight) {
		super(engineType, numberWheels);
		this.weight = weight;
	}
	public void displayWheels() {
		System.out.println("carEngine : "+engineType + " : " + numberWheels +": "+"weight : " + weight);
			}	
}


class Car extends Vehicle {
	int vehicleOccupants;
	
	public Car(String engineType, int numberWheels, int vehicleOccupants ) {
		super(engineType, numberWheels);
		this.vehicleOccupants = vehicleOccupants;
	}
	
	public void displayWheels() {
		System.out.println("carEngine : " +engineType +"  :"+ numberWheels + " : "+ "Occupants : " +vehicleOccupants);
	}
}


class MotorCycle extends Vehicle {
	int price;
	
	public MotorCycle(String engineType, int numberWheels, int price) {
		super(engineType, numberWheels);
		this.price = price;
	}
	public void displayWheels() {
		System.out.println("carEngine : " +engineType + " : " + numberWheels +" : "+ "price : " + price);
		
	}
}


public class Ch08_test_polymorphism {
	
	public static void checkWheels(Vehicle [] a) {
		for (Vehicle v : a) {
			v.displayWheels();
		}
	}
	
public static void main(String[] args) {
	Vehicle [] arr = new Vehicle[3];
	arr[0] = new Truck("power", 4, 100);
	arr[1] = new MotorCycle("light", 2, 30);
	arr[2] = new Car("longRange", 4, 4);
	checkWheels(arr);
}
}
