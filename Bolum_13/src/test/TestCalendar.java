package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	
	public static void run() {
		Calendar c = new GregorianCalendar();
		
		
		System.out.println(new Date());
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		
		System.out.println("---");
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("---");
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.HOUR));
		
		System.out.println("---");
		Calendar c2 = new GregorianCalendar(2000,2,10);
		System.out.println(c2.get(Calendar.YEAR));
		System.out.println(c2.get(Calendar.MONTH));
		System.out.println(c2.get(Calendar.DAY_OF_MONTH));
		
	}
}
