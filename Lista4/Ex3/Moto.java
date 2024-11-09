package Ex3;

public class Moto extends Veiculo {
    private boolean temCarona;

    public Moto(String marca, String modelo, int ano, boolean temCarona) {
        super(marca, modelo, ano);
        this.temCarona = temCarona;
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Tem Carona: " + temCarona);
    }
}
