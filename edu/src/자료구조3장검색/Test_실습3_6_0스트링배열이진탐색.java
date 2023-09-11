package 자료구조3장검색;


//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
public class Test_실습3_6_0스트링배열이진탐색 {

	static void swap(String[] data, int ind1, int ind2) {
		String t = data[ind1];
		data[ind1] = data[ind2];
		data[ind2] = t;
		
	}
	
	static void sortData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);
				}
			}
		}
		
	}
	
	static void showData(String[] data) {
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
	
	private static int linearSearch(String[] data, String key) {
	    for (int i = 0; i < data.length; i++) {
	        if (data[i].equals(key)) { // 문자열이 키와 같은지 확인
	            return i; // 키를 찾았을 경우 해당 인덱스 반환
	        }
	    }
	    return -1; // 키를 찾지 못했을 경우 -1 반환
	}

	
	static int binarySearch(String[] data, String key) {
		int left = 0;
		int right = data.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			int comparison = data[mid].compareTo(key);
			
			if (comparison == 0) {
				return mid;
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "감", "배", "사과", "포도", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		sortData(data);
		showData(data);

		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

	


}