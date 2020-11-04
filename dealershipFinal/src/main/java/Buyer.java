import java.util.Scanner;

public class Buyer {
    Scanner teclado=new Scanner(System.in);

    private String name;
    private Car car00;
    private Car car01;
    private Sale sell;
    private Intern intern;
    private Manager manager;
    private Seller seller;
    private Buyer choosedCar;



    public Car getCar00() {
        return car00;
    }

    public void setCar00(Car car00) {
        this.car00 = car00;
    }

    public Car getCar01() {
        return car01;
    }

    public void setCar01(Car car01) {
        this.car01 = car01;
    }

    public Sale getSell() {
        return sell;
    }

    public void setSell(Sale sell) {
        this.sell = sell;
    }

    public void chooseCar(Car car00, Car car01){
        String name;
        System.out.println("Qual carro você quer comprar?");
        name=teclado.nextLine();
        if(name.equalsIgnoreCase("uno")){
            String response;
            System.out.println("Então você está interessado num "+car00);
            System.out.println("Você é portador de necessidades especiais?");
            response=teclado.nextLine();
            if(response.equalsIgnoreCase("sim")){
                car00.setEspecial(true);
                System.out.println("Você é isento de IPI!");
                setChoosedCar(this.car00.getCar00());
                //sell.chooseSeller(Seller seller, Intern intern,Manager manager);
            }else{
                car00.setEspecial(false);
                this.car00.setPrice((car00.getPrice()*15)/100);
                System.out.println("Junto com o IPI, o preço do seu carro ficará por: "+this.car00.getPrice());
                //sell.chooseSeller();
            }
        }else if(name.equalsIgnoreCase("celta")){
            String response;
            System.out.println("Então você está interessado num "+car01);
            System.out.println("Você é portador de necessidades especiais?");
            response=teclado.nextLine();
            if(response.equalsIgnoreCase("sim")){
                car00.setEspecial(true);
                System.out.println("Você é isento de IPI!");
            }else{
                car01.setEspecial(false);
                this.car01.setPrice((car01.getPrice()*15)/100);
                System.out.println("Junto com o IPI, o preço do seu carro ficará por: "+this.car01.getPrice());
            }
        }
    }

    private void setChoosedCar(Buyer car00) {
    }
}
