package tr.edu.istiklal.shape;

public class Circle2  extends GeometricObject {

	private double radius;
	
	public Circle2() {
		this(1);
	}
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	public Circle2(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}	
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
