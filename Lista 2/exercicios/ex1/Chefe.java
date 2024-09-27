public class Chefe extends Empregado {
    private double beneficios;

    public Chefe(String nome, double salario, double beneficios) {
        super(nome, salario);
        this.beneficios = beneficios;
    }

    @Override
    public double aumentoSalario(double percentual) {
        return super.aumentoSalario(percentual) + beneficios;
    }
}

