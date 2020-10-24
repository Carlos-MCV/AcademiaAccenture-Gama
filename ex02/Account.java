package ex02;

import java.util.Scanner;

public abstract class Account {
    Scanner teclado= new Scanner(System.in);
    private SavingsAccount savingsAccount;
    protected double saldo;
    protected double taxes;
    private String type;


    public Account() {
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void situacao(){
        System.out.println("Dados da Conta: ");
        System.out.println("Saldo: "+this.getSaldo());
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

    public void transfer(SavingsAccount s){
        this.savingsAccount=s;

        System.out.println("Quanto você quer transferir para a poupança?");
        int transferAmount=teclado.nextInt();

        savingsAccount.setSaldo(savingsAccount.getSaldo()+transferAmount);
        System.out.println("Agora você tem: "+savingsAccount.getSaldo()+" na poupança!!");
    }

}
