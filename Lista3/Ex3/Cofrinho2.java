package Lista3.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho2 {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    // Método para contar o número de moedas
    public int contarMoedas() {
        return moedas.size();
    }

    // Método para contar moedas de um determinado valor
    public int contarMoedasDeValor(double valor) {
        int contador = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() == valor) {
                contador++;
            }
        }
        return contador;
    }

    // Método para encontrar a moeda de maior valor
    public Moeda maiorMoeda() {
        if (moedas.isEmpty()) {
            return null;
        }
        Moeda maior = moedas.get(0);
        for (Moeda moeda : moedas) {
            if (moeda.getValor() > maior.getValor()) {
                maior = moeda;
            }
        }
        return maior;
    }
}