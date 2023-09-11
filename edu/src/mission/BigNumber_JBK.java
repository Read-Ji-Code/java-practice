package mission;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;

public class BigNumber_JBK {

	
	public static void main(String[] args) {
		String snum1, snum2;
		try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))) {
			snum1 = br.readLine();
			snum2 = br.readLine();
			System.out.println(snum1);
			System.out.println(snum2);			
			
			char[] Reverse1 = snum1.toCharArray();
			for (int i =0; i< Reverse1.length; i++) {
				System.out.println((int)(Reverse1));
			}
		} catch (Exception e) {
		}
		

	// private static String sumBigNumber(String snum1, String snum2) {

	// 문자열을 배열로 뒤집어서 변환한다.

	// 변환된 배열을 더한다.

	// 뒤집어서 출력한다.
	// }

}
}
