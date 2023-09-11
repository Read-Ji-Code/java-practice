package com.ruby.java.ch08.innerClass;


public class Cha08_test_inner {
	private Node head;
	public Cha08_test_inner() {
		head = null;
	}
	
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}
	
	
	public void add(String data) {
		Node newNode = new Node(data);
	}
	
	
	public void printList() {
		//printList() 결과는 A -> B -> C 등으로 출력한다
	}
	
	
	public void delete(String data) {
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cha08_test_inner myList = new Cha08_test_inner();
		myList.printList();

		myList.add("JAVA");
		myList.add("HTML");
		myList.add("CSS");
		myList.add("Javascript");
		myList.printList();
		myList.delete("CSS");
		myList.printList();
	}

}
