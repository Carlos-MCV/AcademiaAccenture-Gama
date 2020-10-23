package ex05;
import java.util.Scanner;
public class House {
    private String cor;
    private boolean porta1;
    private boolean porta2;
    private boolean porta3;


    public void howManyDoorsAreOpen(){
        System.out.println("Quantiade de portas abertas: ");
        System.out.println("Porta 1 está: "+this.isPorta1());
        System.out.println("Porta 2 está: "+this.isPorta2());
        System.out.println("Porta 3 está: "+this.isPorta3());
    }

    public void pintarCasa(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Qual cor pintar a casa?");
        String respostacor=teclado.nextLine();
        this.setCor(respostacor);
        System.out.println("Acasa foi pintada de: "+this.getCor());
    }

    public void abrirPorta1(){
        setPorta1(true);
        System.out.println("Porta um aberta");
    }

    public void fecharPorta1(){
        setPorta1(false);
        System.out.println("Porta um fechada");
    }

    public void abrirPorta2(){
        setPorta2(true);
        System.out.println("Porta dois aberta");
    }

    public void fecharPorta2(){
        setPorta2(false);
        System.out.println("Porta dois fechada");
    }

    public void abrirPorta3(){
        setPorta3(true);
        System.out.println("Porta três aberta");
    }

    public void fecharPorta3(){
        setPorta3(false);
        System.out.println("Porta três fechada");
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }

}