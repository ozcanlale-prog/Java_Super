package tr.edu.istiklal.interfaces;

public class Chicken extends Animal {

	@Override
	public String sound() {
		return "Chicken: cock-a-doodle-doo";
	}

	@Override
	public String howToEat() {
		return "Chicken: Fry it";
	}
	
}
