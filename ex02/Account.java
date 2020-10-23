package ex02;

import java.util.Scanner;

public class Account {
    Scanner teclado= new Scanner(System.in);
    private Account account;
    private SavingsAccount savingsAccount;
    private double saldo;
    private String type;


    public Account() {
    }



    public String getType() {
        return "Account";
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        //return saldo;
    }



    public void situacao(){
        System.out.println("Dados da Conta: ");
        System.out.print("Saldo: "+this.getSaldo());
    }

    public void deposit(double deposito){
        this.setSaldo(getSaldo()+deposito);
    }

    public void withdraw(double saque){
        this.setSaldo(getSaldo()-saque);
    }

    public double accountIncome(){
        this.setSaldo (this.getSaldo() * 1.7);
        return this.getSaldo();
    }

    public void transfer(Account a,SavingsAccount s){
        this.account=a;
        this.savingsAccount=s;

        System.out.println("Quanto você quer transferir para a poupança?");
        int transferAmount=teclado.nextInt();

        account.setSaldo(account.getSaldo()-transferAmount);
        savingsAccount.setSaldo(savingsAccount.getSaldo()+transferAmount);
        System.out.println("Agora você tem: "+savingsAccount.getSaldo()+" na poupança!!");

    }

}
