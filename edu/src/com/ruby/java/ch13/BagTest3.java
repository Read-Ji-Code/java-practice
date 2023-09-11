package com.ruby.java.ch13;


class Bag3<T,N> {
	private T thing;
	private N name;
	
	public Bag3(T thing, N name) {
		this.thing = thing;
		this.name =name;
	}
	
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
		System.out.println("N의 타입은 " + thing.getClass().getName());
	}
}

class Book {
	public String toString() {
		return "책";
	}
}


public class BagTest3 {
	public static void main(String[] args) {
		Bag3<Book, String> bag = new Bag3<>(new Book(), "과학");
		
		bag.showType();
		
		Book book = bag.getThing();
		String name = bag.getName();
		
		System.out.println("Thing is : " + book);
		System.out.println("name is : " + name);
	}
}
