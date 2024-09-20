public class Cpoupanca extends CCorrente {

private double saldominimo;

public Cpoupanca(int num, double sal, String cli, double salmin) {
    super(num, sal, cli);
    this.saldominimo = salmin;
}

@Override
public void debitar(double valor){
    if (valor <= super.getSaldo()) {
        super.setSaldo(super.getSaldo() - valor);
    if (super.getSaldo() < this.saldominimo)
        this.saldominimo = super.getSaldo();
    }
    else
        System.out.println("Saldo Insuficiente");
}

public void atualizarSaldo(){
    super.setSaldo((super.getSaldo() + (this.saldominimo * 0.05));
    this.saldominimo = super.getSaldo();

}

public double getSaldominimo(){
    return this.saldominimo;
    }
}
