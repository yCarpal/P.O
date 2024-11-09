package Ex1;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5, "Azul");
        Retangulo retangulo = new Retangulo(4, 6, "Vermelho");
        Circulo circulo = new Circulo(3, "Verde");

        System.out.println("Quadrado - Cor: " + quadrado.getCor() + ", Área: " + quadrado.calculaArea());
        System.out.println("Retângulo - Cor: " + retangulo.getCor() + ", Área: " + retangulo.calculaArea());
        System.out.println("Círculo - Cor: " + circulo.getCor() + ", Área: " + circulo.calculaArea());
    }
}