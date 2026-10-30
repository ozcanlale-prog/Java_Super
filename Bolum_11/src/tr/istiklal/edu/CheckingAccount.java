package tr.istiklal.edu;

public class CheckingAccount extends Account {
    private double overdraftLimit = -500.0;

    public CheckingAccount() { super(); }
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Hata: Overdraft limiti aşıldı!");
        }
    }
}