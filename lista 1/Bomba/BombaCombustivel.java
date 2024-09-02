package Bomba;
public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double abastecerPorValor(double valor) {
        double litros = valor / this.valorLitro;
        if (litros <= this.quantidadeCombustivel) {
            this.quantidadeCombustivel -= litros;
            return litros;
        } else {
            System.out.println("Combustível insuficiente na bomba.");
            return 0;
        }
    }

    public double abastecerPorLitro(double litros) {
        double valor = litros * this.valorLitro;
        if (litros <= this.quantidadeCombustivel) {
            this.quantidadeCombustivel -= litros;
            return valor;
        } else {
            System.out.println("Combustível insuficiente na bomba.");
            return 0;
        }
    }

    public void alterarValor(double novoValorLitro) {
        this.valorLitro = novoValorLitro;
    }

    public void alterarCombustivel(String novoTipoCombustivel) {
        this.tipoCombustivel = novoTipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public double getValorLitro() {
        return this.valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }
}