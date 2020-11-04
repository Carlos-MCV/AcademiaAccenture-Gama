public class SalesSystem {
    public static void main(String[] args) {
        Seller newSeller00=new Seller("José",123,123);
        Manager newManager00=new Manager("Mario",321,321);
        Intern newIntern00=new Intern("Alan",111,111);
        newSeller00.wellcome();


        Car newCar00=new Car("Uno",10000);
        Car newCar01=new Car("Celta",15000);


        Buyer newbuyer00 =new Buyer();
        newbuyer00.chooseCar(newCar00,newCar01);


        Sale newSale00=new Sale();
        newSale00.chooseSeller(newSeller00,newIntern00,newManager00);
        newSale00.sell();


    }
}
