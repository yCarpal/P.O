package Ex3;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Portas: " + portas);
    }
}