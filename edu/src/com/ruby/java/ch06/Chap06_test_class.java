package com.ruby.java.ch06;

public class Chap06_test_class {
    static class Student {
        static int countStudents;
        int sid;
        String sname;
        String major;
        int height;
        String city;
        
        public Student() {
        	countStudents++;
        }
        
        
        
        public Student(int sid) {
			this.sid = sid;
			countStudents++;
		}



		public Student(int sid, String sname) {
			this.sid = sid;
			this.sname = sname;
			countStudents++;
		}



		public Student(int sid, String sname, String major) {
			this.sid = sid;
			this.sname = sname;
			this.major = major;
			countStudents++;
		}
		

		public Student(int sid, String sname, String major, int height) {
			this.sid = sid;
			this.sname = sname;
			this.major = major;
			this.height = height;
			countStudents++;
		}

		public Student(int sid, String sname, String major, int height, String city) {
            this.sid = sid;
            this.sname = sname;
            this.major = major;
            this.height = height;
            this.city = city;
            countStudents++;
        }
        
        static void showNumberObjects() {
            System.out.println("학생수는 : " + countStudents);
        }

		public String toString() {
			return "Student [ sid=" + sid + ", sname=" + sname + ", major=" + major + ", height=" + height + ", city="
					+ city + " ]";
		}
		
		void showStudent() {
	        System.out.print("객체: ");
	        System.out.println("객체출력 : " + this.toString()); // Use this.toString()
	        System.out.println();
	    }
		
		public static void show(Student[] a) {
	        for (int i = 0; i < a.length; ++i) {
	            a[i].showStudent();
	        }
		}
        
    }
    
    public static void main(String[] args) {
    	 final int[] a = new int[5];
         final Student[] arry = new Student[5];
         arry[0] = new Student();
         arry[1] = new Student(202301);
         arry[2] = new Student(202302, "Hong");
         arry[3] = new Student(202303, "Lee", "Busan");
         arry[4] = new Student(202304, "Na", "jeju");
         Student.showNumberObjects();
         //Chap06_test_class cc = new Chap06_test_class();
         Student.show(arry);
    }
}
