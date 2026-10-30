package tr.istiklal.edu;

public class TestAccount {
    public static void main(String[] args) {
        // Temel Account nesnesi
        Account account = new Account(1122, 1000.0);
        account.setAnnualInterestRate(1.5);
        account.deposit(200.0);
        account.withdraw(150.0);

        // SavingsAccount (Tasarruf Hesabı) nesnesi - Eksiye düşemez
        SavingsAccount savings = new SavingsAccount(1123, 1000.0);
        savings.deposit(500.0);
        savings.withdraw(1200.0); // Başarılı çekim
        
        // Bu işlem başarısız olmalı ve hata mesajı vermelidir:
        // savings.withdraw(500.0); 

        // CheckingAccount (Vadesi / Kontrol Hesabı) nesnesi - Overdraft limiti var (-500)
        CheckingAccount checking = new CheckingAccount(1124, 500.0, -500.0);
        checking.withdraw(800.0); // Limite uygun çekim (-300 kalır)

        // Sonuçları ekrana yazdıralım
        System.out.println("\n--- Hesap Bilgileri ---");
        System.out.println(account.toString());
        System.out.println("Bakiye: " + account.getBalance());
        
        System.out.println("\n--- Tasarruf Hesabı ---");
        System.out.println(savings.toString());
        System.out.println("Bakiye: " + savings.getBalance());

        System.out.println("\n--- Çek / Vadesiz Hesap ---");
        System.out.println(checking.toString());
        System.out.println("Bakiye: " + checking.getBalance());
    }
}