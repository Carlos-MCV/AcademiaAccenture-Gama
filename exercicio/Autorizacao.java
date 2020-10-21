package exercicio;

import exercicio.empregados.Gerente;

public class Autorizacao implements AutorizacaoI {
    private Gerente gerente;

    public Autorizacao(Gerente gerente){
        this.gerente=gerente;
    }

    @Override
    public boolean permissao(String senha) {
        return gerente.getSenha().equals(senha);
    }
}
