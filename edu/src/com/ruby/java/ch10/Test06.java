package com.ruby.java.ch10;

import java.util.HashMap;
import java.util.Iterator;

public class Test06 {

	public static void main(String[] args) {
		String word[] = { "해시", "리스트', '트리", "배열" };
		String meaning[] = { "호박벌", "천국", "그럼에도불구하고", "호기심" };

		HashMap<String, String> dic = new HashMap<String, String>();

		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);

		}

		System.out.println(dic);
		System.out.println(dic.size());

		System.out.println(dic.keySet());
		System.out.println(dic.values());
		System.out.println(dic.get("트리"));

		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + ":" + dic.get(key));
		}
		for (String key : dic.keySet()) {
			System.out.println(key + " : " + dic.get(key));
		}
	}
}
