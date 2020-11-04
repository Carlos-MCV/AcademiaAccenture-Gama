import java.util.Random;
import java.util.Scanner;

public class Seller extends Employees {
    Scanner teclado=new Scanner(System.in);

    private Sale seller;

    public Sale getSeller() {
        return seller;
    }

    public void setSeller(Sale seller) {
        this.seller = seller;
    }

    public Seller(String name, int id, int password) {
        this.name=name;
        this.id=id;
        this.password=password;
    }

    public void wellcome(){
        String name;
        System.out.println("Olá! Seja bem vindo!");
        System.out.println("Como você se chama?");
        name=teclado.nextLine();
        System.out.println("Pazer ter você concosco, "+name);
        System.out.println("Qual carro você quer comprar?");
    }
}
