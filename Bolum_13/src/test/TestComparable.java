package test;

import java.util.Arrays;

import tr.edu.istiklal.shape.comparable.ComparableCircle;
import tr.edu.istiklal.shape.comparable.ComparableRectangle;

public class TestComparable {

	public static void run() {
		ComparableRectangle[] rectangles = {
				new ComparableRectangle(3.4, 5.4),
				new ComparableRectangle(13.24, 55.4),
				new ComparableRectangle(7.4, 35.4),
				new ComparableRectangle(1.4, 25.4),				
		};
		
		Arrays.sort(rectangles);
		
		for (ComparableRectangle r : rectangles) {
			System.out.println(r + "\n");
		}
		
	}
	
	public static void run2() {
		double[] dizi = {3,1,5,2,7,100};
		Arrays.sort(dizi);
		for (double i : dizi) {
			System.out.println(i + "\n");
		}
	}
	
	public static void run3() {
		ComparableCircle[] circles =  {
			new ComparableCircle(),
			new ComparableCircle(20),
			new ComparableCircle(13),
			new ComparableCircle(4),
			new ComparableCircle(0.5),			
		};
		
		Arrays.sort(circles);
		
		for (ComparableCircle c : circles) {
			System.out.println(c + "\n");
		}
		
	}
}
