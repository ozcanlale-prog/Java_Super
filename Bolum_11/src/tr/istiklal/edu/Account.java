package tr.istiklal.edu;

import java.util.ArrayList;

public class Account {
    private int id;
    private double balance;
	protected double annualInterestRate;
    protected String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int id, double balance) {
        this.name = name; 
        this.id = id; 
        this.balance = balance;
    }

    public Account(int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Para cekme"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Para yatirma"));
    }

    public ArrayList<Transaction> getTransactions() { 
        return transactions; 
    }

    public int getId() {
        return id;
    }

    public String getName() { 
        return name; 
    }

    public double getBalance() { 
        return balance; 
    }

    public double getAnnualInterestRate() { 
        return annualInterestRate; 
    }

    public void setAnnualInterestRate(double r) { 
        this.annualInterestRate = r; 
    }
}