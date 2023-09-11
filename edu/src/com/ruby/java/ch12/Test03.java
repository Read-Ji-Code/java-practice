package com.ruby.java.ch12;

import java.io.BufferedReader;

public class Test03 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new InputStreamReader(System.in))) {
			System.out.println("이름입력");
			String name = br.readLine();
			System.out.println("hello" + name);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
}
