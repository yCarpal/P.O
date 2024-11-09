package Ex1;
public class Retangulo extends Figura implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }
}