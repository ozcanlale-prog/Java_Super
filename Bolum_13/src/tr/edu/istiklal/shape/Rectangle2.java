package tr.edu.istiklal.shape;

public class Rectangle2 extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle2() {
		this(1, 1);
	}
	
	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2(String color, boolean filled, 
			double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
