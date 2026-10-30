package tr.edu.istiklal;

public class Rectangle extends GeometricObject {

	private double width;
	private double height;
	
	public Rectangle() {		
		this(1,1);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);	
		
		this.width = width;
		this.height = height;	
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
		
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public String toString() {
		return "benim to srting";
	}
	
	public String toString(String s) {
		return "benim to srting" + s;
	}
	
	public String toString(String s, int x) {
		return "benim to srting" + s;
	}
	
	@Override
	public boolean equals(Object o) {
		Rectangle r = (Rectangle) o;
		
		return this.width == r.width
				&& this.height == r.height;
	}
	
	
	
}
