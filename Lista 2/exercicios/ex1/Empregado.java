// Classe base Empregado
public class Empregado {
    protected String nome;
    protected double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double aumentoSalario(double percentual) {
        return salario * (1 + percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}