package tr.istiklal.edu;

//TestNewAccount.java
public class TestNewAccount {
 public static void main(String[] args) {
     Account acc = new Account("George", 1122, 1000);
     acc.setAnnualInterestRate(1.5);
     acc.deposit(30); acc.deposit(40); acc.deposit(50);
     acc.withdraw(5); acc.withdraw(4); acc.withdraw(2);

     System.out.println("İsim: " + acc.getName());
     System.out.println("Faiz: " + acc.getAnnualInterestRate());
     System.out.println("Bakiye: " + acc.getBalance());
     for (Transaction t : acc.getTransactions()) {
         System.out.println("Tür: " + t.getType() + ", Miktar: " + t.getAmount() + ", Yeni Bakiye: " + t.getBalance());
     }
 }
}