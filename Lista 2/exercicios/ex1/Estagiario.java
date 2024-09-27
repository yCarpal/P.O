public class Estagiario extends Empregado {
    private double descontos;

    public Estagiario(String nome, double salario, double descontos) {
        super(nome, salario);
        this.descontos = descontos;
    }

    @Override
    public double aumentoSalario(double percentual) {
        return super.aumentoSalario(percentual) - descontos;
    }
}