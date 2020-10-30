package main.java.com.ArrayTest;

import main.java.com.ArrayTest.ex05.Account;
import main.java.com.ArrayTest.ex05.Bank;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank();


        Account newAccount = new Account();
        newAccount.setBalance(100);


        for (int i=0; i< 11; i++) {
            if (bank.addTo(newAccount)){
                System.out.println("New account!");
            }else{
                System.out.println("Can't create account... there is no room for more");
            }
        }

    }
}
