import java.util.*;
public class Cinvestimento extends CCorrente {

    private int diainvestimento;
    private int periodo;

public Cinvestimento(int num, double sal, String cli, int dinv, int per) {
    super(num, sal, cli);
    this.diainvestimento = dinv;
    this.periodo = per;
}

public void atualizarSaldo(){
    Calendar dataAtual = Calendar.getInstance();
    int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
    if (dia == (this.diainvestimento+periodo)){
        super.setSaldo((float) (super.getSaldo() * 1.20));
        }
        else {
        System.out.println("Ainda não é dia do investimento");
        }
    }
}