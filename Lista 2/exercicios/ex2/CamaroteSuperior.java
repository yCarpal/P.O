package ex2;
class CamaroteSuperior extends VIP {
    
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    @Override
    public double getValorVIP() {
        return super.getValorVIP() + 50.0; // Exemplo de valor adicional para o camarote superior
    }
}