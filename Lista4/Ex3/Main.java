package Ex3;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Yamaha", "MT-07", 2019, true);

        carro.exibirDados();
        moto.exibirDados();
    }
}
