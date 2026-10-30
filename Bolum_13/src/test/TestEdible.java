package test;

import tr.edu.istiklal.interfaces.*;

public class TestEdible {

	public static void run() {
		Object[] objects = {
				new Tiger(), 
				new Chicken(), 
				new Apple(),				
		};
		
	
		for (Object o : objects) {
			if (o instanceof Edible) {
				System.out.println(((Edible)o).howToEat());
			}
			
			if (o instanceof Animal) {
				System.out.println(((Animal)o).sound());
			}
		}	
		
	}
}
