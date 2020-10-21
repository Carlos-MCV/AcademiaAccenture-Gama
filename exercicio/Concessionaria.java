package exercicio;

import exercicio.empregados.Estagiario;
import exercicio.empregados.Gerente;
import exercicio.empregados.Vendedor;

import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        Estagiario estagiario=new Estagiario();

        Vendedor vendedor=new Vendedor();

        Gerente gerente=new Gerente();

        //Autorizacao novaAutorizacao=new Autorizacao();

        Cliente clienteNovo = new Cliente();



        clienteNovo.boasVindas();


        Carro carroNovo= new Carro();
        Carro carroNovo2= new Carro();

        carroNovo.escolherTipo();
        carroNovo.escolherModelo();


        Venda venda=new Venda(Cliente.getNome(),Carro.getTipo(),Carro.getModelo());

        gerente.autenticacao();

        venda.venda1();
    }
}
