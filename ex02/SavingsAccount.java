package ex02;

public class SavingsAccount extends Account {

    private double saldo;


    public String getType() {
        return "Savings Account";
    }
    public double getSaldo(){
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
        this.saldo = saldo;

    }
}
