package ex3;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Funcionario(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}