package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01_1 {
	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("a.txt")) {
			int c= 0;
			while((c=fi.read()) != -1 ) {
				System.out.println(c);
				break;
			}
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
