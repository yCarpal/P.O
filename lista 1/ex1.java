public class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    public String mostraCor() {
        return this.cor;
    }

    public double Circunferencia() {
        return this.circunferencia;
    }

    public String Material() {
        return this.material;
    }
}