package tr.istiklal.edu;

public class QuotientThrow {
	public static int qıotient(int num1, int num2) {
		if (num2 == 0) throw new ArithmeticException("Bolen 0 olamaz!");
		return num1 / num2;
	}
		
	    public static void main(String[] args) {
	        // Başarılı işlem
	        int sonuc = QuotientThrow.qıotient(10, 2);
	        System.out.println("10 / 2 = " + sonuc);

	        // Bu satır ArithmeticException fırlatacağı için program burada sonlanacaktır
	        int hataliSonuc = QuotientThrow.qıotient(5, 0);
	        System.out.println("Bu satır çalışmayacak.");
	    }
	
}