package Lista3.Ex3;

public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionarMoeda(new Moeda(1.0));
        cofrinho.adicionarMoeda(new Moeda(0.5));
        cofrinho.adicionarMoeda(new Moeda(0.25));
        cofrinho.adicionarMoeda(new Moeda(1.0));

        System.out.println("Total no cofrinho: " + cofrinho.calcularTotal());
        System.out.println("Número total de moedas: " + cofrinho.contarMoedas());
        System.out.println("Número de moedas de 1.0: " + cofrinho.contarMoedasDeValor(1.0));

        Moeda maior = cofrinho.maiorMoeda();
        if (maior != null) {
            System.out.println("Moeda de maior valor: " + maior.getValor());
        } else {
            System.out.println("Cofrinho está vazio.");
        }
    }
}
