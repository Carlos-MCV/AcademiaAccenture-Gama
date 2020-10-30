package main.java.com.ArrayTest.ex05;

import java.util.Arrays;

public class Bank {
    public String name;
    private int number;
    private Account[] newAccount = new Account[10];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account[] getAccounts() {
        return newAccount;
    }

    public void setAccounts(Account[] accounts) {
        this.newAccount = accounts;
    }



    public boolean addTo(Account account) {
        for (int i=0; i < this.newAccount.length; i++) {
            if (this.newAccount[i] == null){
                this.newAccount[i] = account;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Bank name= "+name+"; Number="+number+"; Accounts="+Arrays.toString(newAccount) +                '}';
    }
}
