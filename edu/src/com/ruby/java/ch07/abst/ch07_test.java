package com.ruby.java.ch07.abst;


class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;
	}
	public double perimeter() {
		double ab, bc, ca;
		ab = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		bc = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		ca = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
		double sum = ab + bc + ca;
		return sum;
		}
	
	public double area() {
		double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        
        double multi = (side1 + side2 + side3) / 2;
		return multi;
	}
}

class Rectangle implements Shape {
	private int x1,y1,x2,y2;
	
	public Rectangle(int x1,int y1,int x2,int y2) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
	}
	public double perimeter() {
		 double width = Math.abs(x2 - x1);
	     double height = Math.abs(y2 - y1);
	     double sum = 2 * (width + height);
	     return sum;
	}
	
	public double area() {
		float multi =  Math.abs(x2 - x1)*Math.abs(y2 - y1);
		return multi;
	}
	
	
}

 class Square implements Shape{ 
	  private int x1,y1,x2,y2;
  
  public Square (int x1,int y1, int x2, int y2) { 
  this.x1 = x1; this.y1 = y1;
  this.x2 = x2; this.y2 = y2; } 
  
  public double perimeter() {
	  double sum = ((x2-x1) + (y2-y1))*2;
	  return sum;
 }
  public double area() {
	  double multi = (x2-x1)*(y2-y1);
	  return multi;
	  }
}
public class ch07_test {
	public static void main(String[] args) {	
	Shape t = new Triangle(1,2,3,4,5,6);
	Shape r = new Rectangle(1,2,3,4);
	Shape s = new Square(1,2,3,4);
	System.out.println("삼각형 둘레 길이 = " + t.perimeter());
	System.out.println("삼각형 넓이 = " + t.area());
	System.out.println("사각형 둘레 길이 = " + r.perimeter());
	System.out.println("사각형 넓이 = " + r.area());
	System.out.println("사각형 둘레 길이 = " + s.perimeter());
	System.out.println("사각형 면적 = " + r.area());
	}
}