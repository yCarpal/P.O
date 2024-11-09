package Lista3.Ex2;

public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionarMoeda(new Moeda(1.0));
        cofrinho.adicionarMoeda(new Moeda(0.5));
        cofrinho.adicionarMoeda(new Moeda(0.25));

        System.out.println("Total no cofrinho: " + cofrinho.calcularTotal());
    }
}