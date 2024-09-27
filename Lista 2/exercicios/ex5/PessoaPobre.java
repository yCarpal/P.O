package ex5;
public class PessoaPobre extends Pessoa {
    public PessoaPobre(String nome) {
        super(nome);
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
}