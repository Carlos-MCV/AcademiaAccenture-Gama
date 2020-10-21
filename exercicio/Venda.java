package exercicio;

import exercicio.empregados.Estagiario;
import exercicio.Carro;
import exercicio.Cliente;

public class Venda implements Venda0{
    private Carro carro;
    private String tipoCarro;
    private double preco;
    private Empregado empregado;
    private boolean autenticacao = false;
    private String cliente;
    private int parcela;

    public Venda(String nome, String tipo, String modelo) {
        this.cliente= Cliente.getNome();
        this.carro= Carro.getModelo();
        this.tipoCarro= Carro.getTipo();
    }


    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }


    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public boolean isAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(boolean autenticacao) {
        this.autenticacao = autenticacao;
    }



    @Override
    public String ipi() {
        double preco = carro.getValor();
        //!carro.isTipol()
        if (carro.isTipol() == false) {
            setPreco(carro.getValor() * 1.15);
        }
        if (this.parcela > 1) {
            double juros = preco * 0.0189 * this.parcela;
            setPreco(getPreco() + juros);
            System.out.println(carro.getValor() + parcela);
        } else {
            preco -= preco * 0.10;
            System.out.println(carro.getValor());
        }
        return null;
    }

    @Override
    public String venda1() {
        if (empregado instanceof Estagiario) {
            if (this.autenticacao) {
                System.out.println("Venda realizada!" + ipi());
            } else {
                System.out.println("O estagiário não tem permissão para realizar venda...");
            }
        }
        System.out.println("Parabéns " + getNome()+ "!! Carro" + getModelo() + " tipo" + getTipo() + " vendido com sucesso!");
        return null;
    }
}