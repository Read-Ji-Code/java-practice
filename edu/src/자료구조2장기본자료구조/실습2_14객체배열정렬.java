package 자료구조2장기본자료구조;

import java.util.Arrays;

class PhyscData2 implements Comparable<PhyscData2> {
	String name;
	int height;
	double vision;

	public PhyscData2(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;

	}

	@Override
	public int compareTo(PhyscData2 p) {
		int result = this.name.compareTo(p.name);
		if (result != 0)
			return result;

		int heightResult = this.height - p.height;
		if (heightResult != 0)
			return heightResult;

		double visionResult = this.vision - p.vision;
		if (visionResult != 0)
			return (int) visionResult;
		return 0;
	}
}

public class 실습2_14객체배열정렬 {
	public static void showData(PhyscData2[] data) {
		for (PhyscData2 item : data) {
			System.out.println(item.name + " " + item.height + " " + item.vision);
		}
		System.out.println();
	}

	static void swap(PhyscData2[] arr, int ind1, int ind2) {
		PhyscData2 t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}

	public static void sortData(PhyscData2[] data) {
		Arrays.sort(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);
				}
			}
		}

	}

	public static void main(String[] args) {
		PhyscData2[] data = { new PhyscData2("홍길동", 162, 0.3), new PhyscData2("홍길동", 162, 1.3),
				new PhyscData2("홍길", 152, 0.7), new PhyscData2("김홍길동", 172, 0.3), new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2), new PhyscData2("최길동", 169, 0.5), };
		showData(data);
		sortData(data);
		showData(data);
	}

}
