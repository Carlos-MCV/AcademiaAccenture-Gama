package main.java.com.ArrayTest;

import main.java.com.ArrayTest.ex05.Account;

public class ArrayTest {

    public static void main(String[] args) {
        Account[] newAccount = new Account[10];
        double totalBalance = 0;

        for (int i=0; i<newAccount.length; i++) {
            newAccount[i] = new Account(i*100);
            System.out.println(newAccount[i]);
            totalBalance += newAccount[i].getBalance();
        }

        System.out.println(averageBalance(totalBalance,newAccount.length));
    }

    public static double averageBalance(double value, int times) {
        return value/times;
    }
}
