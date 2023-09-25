package 자료구조6장정렬;

//PhyscData 클래스를 Comparable로 수정해야 한다.
//stack을 이용한 객체들의 non-recusrive MergeSort 구현

	//MergeSort() 구현 소스 코드를 사용하여 객체들의 정렬 소스코드로 수정한다.
import java.util.Arrays;
import java.util.Comparator;

class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;
	
	PhyscData(String name, int height, double vision) {
		this.name = name; this.height=height; this.vision =vision;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(double vision) {
		this.vision = vision;
	}
	
	@Override
	public String toString() {
		return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
	}

	@Override
	public int compareTo(PhyscData o2) {
		if (name.compareTo(o2.name) != 0)
			return name.compareTo(o2.name);
		if (height > o2.height)
			return 1;
		else if (height < o2.height)
			return -1;
		if (vision > o2.vision)
			return 1;
		else
			return -1;
	}
}

	public class MergeSortObjects {

		// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
		static void merge(PhyscData[] a, int lefta, int righta, int leftb, int rightb ) {
			 PhyscData[] tmp = new PhyscData[rightb - lefta + 1];
		        int ix = 0;
		        int p = lefta, q = leftb;
		        while (p <= righta && q <= rightb) {
		            if (a[p].compareTo(a[q]) < 0)
		                tmp[ix++] = a[p++];
		            else
		                tmp[ix++] = a[q++];
		        }
		        while (p <= righta) {
		            tmp[ix++] = a[p++];
		        }
		        while (q <= rightb) {
		            tmp[ix++] = a[q++];
		        }
		        for (int j = 0; j < tmp.length; j++) {
		            a[lefta + j] = tmp[j];
		        }
		}

		// --- 퀵 정렬(비재귀 버전)---//
		static void MergeSort(PhyscData[] a, int left, int right) {
			int mid = (left+right)/2;
			if (left == right) return;
			MergeSort(a, left, mid);
			MergeSort(a, mid+1, right);
			merge(a, left, mid, mid+1, right);
			return;
		}

		public static void main(String[] args) {
			PhyscData[] x = {
			         new PhyscData("황민하", 162, 0.3),
			         new PhyscData("김찬우", 173, 0.7),
			         new PhyscData("박준서", 171, 2.0),
			         new PhyscData("유서범", 171, 1.5),
			         new PhyscData("이수연", 168, 0.4),
			         new PhyscData("홍경오", 171, 1.2),
			         new PhyscData("고지안", 169, 0.8),
			     };
			int nx = x.length;

			   MergeSort(x, 0, nx - 1); // 배열 x를 퀵정렬
				System.out.println("오름차순으로 정렬했습니다.");
			     System.out.println("■ 신체검사 리스트 ■");
			     System.out.println(" 이름     키  시력");
			     System.out.println("------------------");
			     for (int i = 0; i < x.length; i++)
			         System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
	}
