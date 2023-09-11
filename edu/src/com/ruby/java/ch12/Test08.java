package com.ruby.java.ch12;
import java.io.*;
import java.util.Properties;

public class Test08 {
	
	public static void main(String[] args) {
		try(Reader reader = new FileReader("user.properties")) {
			Properties user = new Properties();
			user.load(reader);
			
			System.out.println("id");
			System.out.println("name");
			System.out.println("password");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
