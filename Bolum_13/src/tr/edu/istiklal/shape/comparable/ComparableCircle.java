package tr.edu.istiklal.shape.comparable;

import tr.edu.istiklal.shape.Circle2;

public class ComparableCircle extends Circle2 implements Comparable<Circle2>{

	public ComparableCircle() {
		this(1);
	}
	
	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(Circle2 o) {
		if (this.getDiameter() == o.getDiameter()) {
			return 0;
		} else if (this.getDiameter() > o.getDiameter()) {
			return 1;
		} else {//if (this.getDiameter() < o.getDiameter()) {
			return -1;
		}
	}
	
	@Override
	public String toString() {		
		//return Double.toString(this.getDiameter());
		return this.getDiameter() +"";
	}

}
