package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10 {

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<Integer> lotto = null;
		for (int i = 0; i < n; i++) {
			lotto = new HashSet<Integer>();

			for (int j = 0; lotto.size() <= 6; j++) {
				int num = 0;
				while (num == 0) {
					num = number.nextInt(46);
				}
				lotto.add(num);
			}

			List<Integer> L = new ArrayList<Integer>(lotto);
			Collections.sort(L);
			System.out.println(L);
		}
	}

	public static void main(String[] args) {

		lotto_generator(5);

	}
}
