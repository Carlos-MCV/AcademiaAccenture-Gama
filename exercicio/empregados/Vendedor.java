package exercicio.empregados;
import exercicio.Empregado;
import java.util.Scanner;


public class Vendedor implements VendedorI {
    Scanner teclado=new Scanner(System.in);

    private String nome;


    public Vendedor(){
        this.nome="Micky";

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    @Override
    public void escolherNome() {

    }

}
