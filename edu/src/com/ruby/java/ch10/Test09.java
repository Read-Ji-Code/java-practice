package com.ruby.java.ch10;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test09 {

	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();

		users.put("20090319", "kimpurem");
		users.put("20070620", "kimhaneul");
		users.put("20050817", "ohjungim");
		users.put("20120728", "kimubin");
		users.put("20120924", "kimyongbin");

		System.out.println(users);

		Map.Entry<String, String> entry = null;

		entry = users.firstEntry();
		print("입사일자가 가장 빠른사람", entry);

		entry = users.lastEntry();
		print("입사일자가 가장 늦은사람", entry);

		entry = users.lowerEntry("20121231");
		print("2012년에 가장 늦게 입사한 사람", entry);
		
		entry = users.higherEntry("20120101");
		print("2012년에 가장 빠르게 입사한사람", entry);
		
		while(!users.isEmpty()) {
			entry = users.pollFirstEntry();
			print("퇴직한 사람", entry);
			System.out.println("남아있는직원수: " + users.size());
			
		}

	}

	private static void print(String s, Map.Entry<String, String> entry) {
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
		
	}
	
}
