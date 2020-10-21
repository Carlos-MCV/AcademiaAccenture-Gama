package exercicio;

import java.util.Scanner;

public class Cliente {
    Scanner teclado=new Scanner(System.in);


    private static String nome;



    public static String getNome() {
        return nome;
    }

    public void setName(String clienteNome) {
        this.nome = clienteNome;
    }



    public void boasVindas() {
        System.out.println("Seja bem vindo(a)!!!");
        System.out.println("Qual é o seu nome? ");
        String clienteNome=teclado.nextLine();
        System.out.print("É um prazer: "+clienteNome);
        setName(clienteNome);
    }
}
