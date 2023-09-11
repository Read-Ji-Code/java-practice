package com.ruby.java.ch10;

import java.util.Iterator;
import java.util.LinkedList;

public class Test05 {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("서울");list.add("부산");list.add("대구");
	list.add("광주");list.add("제주");list.add("인천");
	
	Iterator<String> iter = list.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next() + " > ");
	}
	list.sort(null);
}
}
