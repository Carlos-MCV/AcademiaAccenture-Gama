package exercicio;

public abstract class Empregado implements EmpregadoI{

    private String nome;
    private String registro;


    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    @Override
    public void setRegistro(String registro) {
        this.registro=registro;
    }

}
