package com.ruby.java.ch08.innerClass;

public class MyLinkedList {

	private Node head = null;

	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	public MyLinkedList() {}
	public void add(String data) {
		Node nd = new Node(data);
		Node next = head;
		if (head == null)
			head = nd;
		else {
			while (next.link != null)
				next = next.link;
			next.link = nd;
		}
	}
	public void print() {
		Node next = head;
		while (next != null) {
			System.out.println(" " + next.data);
			next = next.link;
		}
	}
	
	public void delete(String data) {

		if (head == null) {

			System.out.println("삭제할 데이터가 없습니다.");

		} else {

			Node p = head;

			Node q = p;
			while ( p!=null) {
				String s;
				s = p.data;
				if (s.compareTo("177")==) {
					
				}

			//**** 구현할 부분

			System.out.println("삭제할 데이터가 없읍니다.");

			return;

		}


	}
}