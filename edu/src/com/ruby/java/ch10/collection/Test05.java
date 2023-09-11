package com.ruby.java.ch10.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {

		public static void main(String[] args) {
			LinkedList<String> list = new LinkedList<String>();
			
			list.add("서울");
			list.add("북경");
			list.add("상해");
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i)+"\t");
			}
			
			list.add(1,"LA"); print(1,list);
			list.addFirst("런던"); print(2,list);
			list.addLast("서울"); print(3,list);
			
			List<String> list2 = Arrays.asList("북경","상해");
			list.addAll(list2);
			
			Object obj[] = list.toArray();
			System.out.println("24:" + Arrays.toString(obj));
			
			String cities[] = new String[0];
			cities = list.toArray(cities);
			System.out.println("25 : " + Arrays.toString(cities));
			
			list.removeAll(list2); print(26,list);
			
		}
		public static void print(int n, List<String> list) {
			System.out.println(n + " : " + list);
		}
}
