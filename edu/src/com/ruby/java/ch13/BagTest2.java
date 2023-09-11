package com.ruby.java.ch13;


class Bag2 {
	private Object thing;
	
	public Bag2(Object thing) {
		this.thing = thing;
	}
	
	public Object getThing() {
		return thing;
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

public class BagTest2 {
	public static void main(String[] args) {
		Bag2 bag = new Bag2(new Book());
		Bag2 bag2 = new Bag2(new PencilCase());
		Bag2 bag3 = new Bag2(new Notebook());
		
		Book book = (Book) bag.getThing();
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook) bag3.getThing();
	
	}
}
