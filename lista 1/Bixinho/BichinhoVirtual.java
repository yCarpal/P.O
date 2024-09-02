package Bixinho;

public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtual(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public int getHumor() {
        return (fome + saude) / 2;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }
}