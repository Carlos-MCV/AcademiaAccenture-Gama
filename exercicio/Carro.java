package exercicio;

import java.util.Scanner;

public class Carro implements Carro0 {
    Scanner teclado=new Scanner(System.in);

    private static String tipo;
    private static String modelo;
    private double valor;
    private boolean tipol;



    public Carro(){

    }


    public static String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public boolean isTipol() {
        return tipol;
    }

    public void setTipol(boolean tipol) {
        this.tipol = tipol;
    }



   /* public void escolherTipo(String tipo) {
        System.out.println("Qual carro você quer comprar ?");
        System.out.println("Carro1 ou carro2?");
        tipo=teclado.nextLine();
        switch (tipo){
            case "carro1":
                this.setValor(100.000);
                break;
            case "carro2":
                this.setValor(60.000);
                break;
        }
        setTipo(tipo);
        }
    */


    @Override
    public void escolherModelo() {
        System.out.println("Você é portador de necessidades especiais?");
        String carroModelo=teclado.nextLine();
        setModelo(carroModelo);

        if(getModelo().equals("sim")){
            System.out.println("Você está isento de pagar IPI");
            tipol=true;
        }else{
            System.out.println("Seu carro terá um acréscimo de 15% de IPI!");
            tipol=false;
        }

    }

    @Override
    public void escolherTipo() {
        System.out.println("Qual carro você quer comprar ?");
        System.out.println("Carro1 ou carro2?");
        tipo=teclado.nextLine();
        switch (tipo){
            case "carro1":
                this.setTipo("Tipo1");
                this.setValor(100.000);
                break;
            case "carro2":
                this.setTipo("Tipo2");
                this.setValor(60.000);
                break;
        }
        setTipo(tipo);

        System.out.println("O valro deste carro é de: "+this.getValor()+"!");

    }


    //public int getPreco() {
    //    return getPreco();
    //}
}
