package ex02;

public class CheckingAccount extends Account implements TaxableI{

    public String getType() {
        return "Checking Account";
    }


    public void mostrarTaxa(){
        System.out.println("Taxa a ser paga..."+this.getTaxes());
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

    @Override
    public double getTaxes() {
        this.setTaxes(getSaldo()*1/100);
        return this.taxes;
    }

    public void setTaxes(double taxes){
        this.taxes=taxes;
    }
}
