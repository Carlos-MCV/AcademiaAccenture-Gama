package exercicio.empregados;

import exercicio.Empregado;
import exercicio.Autorizacao;
import exercicio.Venda;
public class Gerente extends Empregado implements Gerente0 {
    private String nome;
    private String senha;


    public Gerente(){
    this.nome="Carlos";
    this.senha="123";
    }


    public void autenticar(String senha, Venda venda){
        Autorizacao autorizado = new Autorizacao(this);
    }



    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){

        this.senha = senha;
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public void autenticacao() {
        this.setSenha("123");
    }
}
