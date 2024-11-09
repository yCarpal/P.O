package Ex2;

public class ContaEspecial implements Tributavel {
    private double saldo;

    public ContaEspecial(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.05;
    }
}