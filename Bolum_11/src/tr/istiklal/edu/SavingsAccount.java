package tr.istiklal.edu;

public class SavingsAccount extends Account {
    public SavingsAccount() { super(name, id, annualInterestRate); }
    public SavingsAccount(int id, double balance) { super(name, id, balance); }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Hata: Tasarruf hesabı eksiye düşürülemez!");
        }
    }
	private void setBalance(double d) {
		// TODO Auto-generated method stub
		
	}
}