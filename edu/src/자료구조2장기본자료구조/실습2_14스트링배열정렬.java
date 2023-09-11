package 자료구조2장기본자료구조;

public class 실습2_14스트링배열정렬 {
	

	static void showData(String[] arr) {
		for (String item : arr) {
			System.out.println(item + " ");
		}
		System.out.println();
	}

	static void swap(String[] arr, int ind1, int ind2) {
		String t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}

	static void sortData(String []arr) {
	
	int n = arr.length;
	for (int i = 0; i < n - 1; i++) {
		for (int j = 0; j < n - i - 1; j++) {
             if (arr[j].compareTo(arr[j + 1]) > 0) {
                 swap(arr, j, j + 1);
             }
         }
	}

}
	
	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "pear", "blueberry", "strawberry", "melon", "oriental melon" };

		showData(data);
		sortData(data);
		showData(data);
	}
}
