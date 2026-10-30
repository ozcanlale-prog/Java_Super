package test;

import tr.edu.istiklal.shape.Circle2;
import tr.edu.istiklal.shape.GeometricObject;
import tr.edu.istiklal.shape.Rectangle2;

public class TestGeometricObject {
	
	public static void run() {
		
		GeometricObject geoObject1 = new Circle2(5);
		GeometricObject geoObject2 = new Rectangle2(5, 3);
		
		
		System.out.println("The two objects have the same area? " +
				 equalArea(geoObject1, geoObject2));
		
		displayGeometricObject(geoObject1);
		displayGeometricObject(geoObject2);
	}

	private static void displayGeometricObject(GeometricObject geoObject1) {
		System.out.println();
		System.out.println("The area is " + geoObject1.getArea());
		System.out.println("The perimeter is " + geoObject1.getPerimeter());
		
	}

	private static boolean equalArea(GeometricObject geoObject1, GeometricObject geoObject2) {
		return geoObject1.getArea() == geoObject2.getArea();
	}
}
