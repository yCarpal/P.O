package ex3;
public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, String endereco, String telefone, String email, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, endereco, telefone, email, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }
}
