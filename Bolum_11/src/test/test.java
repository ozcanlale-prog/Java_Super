package test;

import tr.edu.istiklal.*;

public class test {

	public static void main(String[] args) {
		/*Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(10);
		
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c2.equals(c3));*/
		
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2,3);
		Rectangle r3 = new Rectangle(4,8);
		Rectangle r4 = new Rectangle(4,8);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
		System.out.println(r2.equals(r2));
		
		System.out.println(r3.equals(r4));
		
		
	}
}
