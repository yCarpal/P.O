package Bomba;

public class MainBombaCombustivel {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.60, 100.0);
        System.out.println("Tipo de Combustível: " + bomba.getTipoCombustivel());
        System.out.println("Valor por litro: " + bomba.getValorLitro());
        System.out.println("Quantidade na bomba: " + bomba.getQuantidadeCombustivel() + " litros");

        double litrosAbastecidos = bomba.abastecerPorValor(50.0);
        System.out.println("Litros abastecidos: " + litrosAbastecidos);
        System.out.println("Quantidade restante na bomba: " + bomba.getQuantidadeCombustivel() + " litros");

        double valorAPagar = bomba.abastecerPorLitro(10.0);
        System.out.println("Valor a pagar por 10 litros: R$ " + valorAPagar);
        System.out.println("Quantidade restante na bomba: " + bomba.getQuantidadeCombustivel() + " litros");

        bomba.alterarValor(6.00);
        bomba.alterarCombustivel("Diesel");
        bomba.alterarQuantidadeCombustivel(200.0);

        System.out.println("Novo tipo de combustível: " + bomba.getTipoCombustivel());
        System.out.println("Novo valor por litro: R$ " + bomba.getValorLitro());
        System.out.println("Nova quantidade na bomba: " + bomba.getQuantidadeCombustivel() + " litros");
    }
}
    
