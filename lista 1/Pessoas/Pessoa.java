package Pessoas;
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        if (this.idade < 21) {
            crescer(0.5);
        }
        this.idade++;
    }

    public void engordar(double kilos) {
        this.peso += kilos;
    }

    public void emagrecer(double kilos) {
        this.peso -= kilos;
    }

    public void crescer(double centimetros) {
        this.altura += centimetros;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }
}