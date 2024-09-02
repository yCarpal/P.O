package Pessoas;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 20, 70.0, 175);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura em cm: " + pessoa.getAltura());
        
        pessoa.envelhecer();
        System.out.println("Idade após envelhecer: " + pessoa.getIdade());
        System.out.println("Altura após envelhecer em cm: " + pessoa.getAltura());
        
        pessoa.engordar(5.0);
        System.out.println("Peso após engordar: " + pessoa.getPeso());
        
        pessoa.emagrecer(3.0);
        System.out.println("Peso após emagrecer: " + pessoa.getPeso());
    }
}
