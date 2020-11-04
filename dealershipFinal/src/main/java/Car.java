public class Car {
    private String name;
    private boolean especial;
    private double price;
    private Buyer car00;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Buyer getCar00() {
        return car00;
    }

    public void setCar00(Buyer car00) {
        this.car00 = car00;
    }
}
