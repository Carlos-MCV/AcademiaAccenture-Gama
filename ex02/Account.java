package ex02;

public class Account {
    private double saldo;


    public Account() {
        this.setSaldo(300);
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
}
