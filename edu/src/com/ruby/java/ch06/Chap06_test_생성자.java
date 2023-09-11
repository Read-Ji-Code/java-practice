package com.ruby.java.ch06;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
* 생성자 함수 구현 - this(); 호출 사용
* static 데이터 멤버 사용
* static 멤버 함수 구현
* toString() 함수 구현과 사용
* 객체 배열 사용
*/

public class Chap06_test_생성자 {
    static int countStudents = 0; // Initialize the object count
    int sid; // Student ID
    String sname; // Student name
    String city; // Address city

    public Chap06_test_생성자(int sid, String sname, String city) {
        this.sid = sid;
        this.sname = sname;
        this.city = city;
        countStudents++; // Increment the object count
    }

    void showStudent() {
        System.out.print("객체: ");
        System.out.println("객체출력 : " + this.toString()); // Use this.toString()
        System.out.println();
    }

    @Override
    public String toString() { // Override the toString() method
        return "sid: " + sid + ", sname: " + sname + ", city: " + city;
    }

    static void showNumberObjects() {
        System.out.println("총 학생 수: " + countStudents);
    }

    public static void main(String[] args) {
        Chap06_test_생성자 s = new Chap06_test_생성자(11, "hong", "busan");
        s.showStudent();
        showNumberObjects();
    }
}
