package main.java.com.ArrayTest.ex05;

public class Account {
    private double finalBalance;


    public Account(double balance) {
       this.finalBalance = 100;
    }

   public Account() {

    }

    public double getBalance() {
        return finalBalance;
    }

    public void setBalance(double balance) {
        this.finalBalance = balance;
    }

    
    @Override
    public String toString() {
        return "Account's balance= " + finalBalance;
    }
}
