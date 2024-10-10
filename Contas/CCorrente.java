public class CCorrente {
    private int numero;
    private double saldo;

    public CCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta:" + numero + " Saldo:" + saldo;
    }
}