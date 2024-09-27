package ex5;
public class PessoaRica extends Pessoa {
    public PessoaRica(String nome) {
        super(nome);
    }

    public void fazerCompras() {
        System.out.println(nome + " está fazendo compras.");
    }
}


