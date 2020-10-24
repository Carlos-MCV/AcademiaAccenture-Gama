package ex02;

public class LifeInsurance extends Account implements TaxableI{
    private double value;
    private String owner;
    private int insuranceNumber;
   // private String type;



    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getType(){
        return "Novo Seguro de vida!";
    }

    @Override
    public double getTaxes() {
        this.setTaxes(getValue()+ 42 + (getValue() * 0.02));
        return this.taxes;
    }
}
