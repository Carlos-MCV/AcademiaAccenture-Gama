package ex01;


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.print("Digite um valor:");
        int saida00=teclado.nextInt();
        System.out.print("Outro: ");
        int saida01=teclado.nextInt();
        System.out.print("Último");
        int saida02=teclado.nextInt();

        System.out.println("");

        System.out.println(saida00);
        System.out.println(saida01);
        System.out.println(saida02);

    }
}
