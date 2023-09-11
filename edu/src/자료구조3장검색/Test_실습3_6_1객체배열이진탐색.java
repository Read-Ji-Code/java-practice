package 자료구조3장검색;


import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;
	
	public PhyscData(String name,int height,double vision) {
		this.name=name; this.height=height; this.vision=vision;
	}		
	public int compareTo(PhyscData p) {
		return name.compareTo(p.name);
	}
	 public String toString() {
	        return "이름: " + name + ", 키: " + height + " 시력 :" + vision;
	    }
}
public class Test_실습3_6_1객체배열이진탐색 {

	

	
	static void swap(PhyscData[] data, int ind1, int ind2) {
		PhyscData t = data[ind1];
		data[ind1] = data[ind2];
		data[ind2] = t;
		
	}
	
	
	static void sortData(PhyscData[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);
				}
			}
		}
		
	}
		
	
	static void showData(PhyscData[]arr) {
		System.out.println();
		
		for (PhyscData fruit: arr) {
			System.out.print(fruit+" ");
		}
		System.out.println();
	}
	
	
		
		
		public static void main(String[] args) {

			PhyscData[] data = {
					new PhyscData("홍길동", 162, 0.3),
					new PhyscData("홍동", 164, 1.3),
					new PhyscData("홍길", 152, 0.7),
					new PhyscData("김홍길동", 172, 0.3),
					new PhyscData("길동", 182, 0.6),
					new PhyscData("길동", 167, 0.2),
					new PhyscData("길동", 167, 0.5),
			};
			
		
		showData(data);
		Arrays.sort(data);
		sortData(data);
		PhyscData key = new PhyscData("길동", 167, 0.2);
		Arrays.binarySearch(data, key);
		showData(data);
		
		
		
		int result = linearSearch(data, key);
		
		System.out.println("\nlinearSearch(): result = " + result);
		key = new PhyscData("길동", 167, 0.5);

		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
		}


		private static int binarySearch(PhyscData[] data, PhyscData key) {
			 for (int i = 0; i < data.length; i++) {
			        if (data[i].equals(key)) { // 문자열이 키와 같은지 확인
			            return i; // 키를 찾았을 경우 해당 인덱스 반환
			        }
			    }
			    return -1; // 키를 찾지 못했을 경우 -1 반환
		}


		private static int linearSearch(PhyscData[] data, PhyscData key) {
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
		
	}

