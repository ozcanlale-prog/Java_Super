package tr.istiklal.edu;
import java.util.Scanner;
public class QuotientWithif {

	public static void main(String[] args) {	
		Scanner girdi = new Scanner(System.in);
		System.out.println("Iki tane sayi girin:");
		int num1 = girdi.nextInt(); int num2 = girdi.nextInt();
		if(num2 != 0) {
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("Tanimsiz eleman girildi!");
		}
	}
}
