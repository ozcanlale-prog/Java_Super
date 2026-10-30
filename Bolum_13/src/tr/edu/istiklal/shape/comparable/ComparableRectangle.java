package tr.edu.istiklal.shape.comparable;

import tr.edu.istiklal.shape.Rectangle2;

public class ComparableRectangle extends Rectangle2 implements Comparable<Rectangle2> {

	public ComparableRectangle(double width, double height) {
		super(width, height);
	}	
	
	@Override
    public int compareTo(Rectangle2 o) {	    
		if (this.getArea() == o.getArea()) {
			return 0;
		} else if (this.getArea() > o.getArea()) {
			return 1;
		} else //if (this.getArea() < o.getArea()) {
			return -1;
		//}	
	
    }
	
	@Override
    public String toString() {
	    return super.toString() + " Area: " + getArea();
    }

}
