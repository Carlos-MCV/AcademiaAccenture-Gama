package ex02;

public class CheckingAccount extends Account{

    public String getType() {
        return "Checking Account";
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void withdraw(double saque) {
        super.withdraw(saque);
        this.setSaldo(getSaldo()-saque);
        this.setSaldo(getSaldo()+0.10);
    }
}
