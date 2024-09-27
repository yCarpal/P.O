package ex3;
public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, String endereco, String telefone, String email, int numeroMatricula, double bonusSalarial) {
        super(nome, endereco, telefone, email, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }
}
