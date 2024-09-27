package ex3;

public class Assistente extends Funcionario {
    protected int numeroMatricula;

    public Assistente(String nome, String endereco, String telefone, String email, int numeroMatricula) {
        super(nome, endereco, telefone, email);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
}