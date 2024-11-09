package Ex1;
public class Quadrado extends Figura implements AreaCalculavel {
    private double lado;

    public Quadrado(double lado, String cor) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}