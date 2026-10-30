import java.util.Scanner;
public class QuotientWithException {
	
	
public static int quotient(int n1, int n2) {
if (n2 == 0) throw new ArithmeticException("Divisor cannot be zero");
return n1 / n2;
}	


public static void main(String[] args) {
Scanner input = new Scanner(System.in);
try {
int result = quotient(input.nextInt(), input.nextInt());
System.out.println("Result: " + result);
} 

catch (ArithmeticException ex) {
System.out.println("Exception: " + ex);
}
}
}