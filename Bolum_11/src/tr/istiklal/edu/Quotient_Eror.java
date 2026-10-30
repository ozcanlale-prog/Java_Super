package tr.istiklal.edu;

import java.util.Scanner;

public class Quotient_Eror{		
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Iki tane sayi giriniz:");
		int num1 = girdi.nextInt();
		int num2 = girdi.nextInt();
		System.out.println(num1 + "/" + num2 + "is" + (num1/num2));
	}
}