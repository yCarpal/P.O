package Ex2;


public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaEspecial contaEspecial = new ContaEspecial(2000);
    
        System.out.println("Conta Corrente - Saldo: " + contaCorrente.getSaldo() + ", Tributos: " + contaCorrente.calculaTributos());
        System.out.println("Conta Especial - Saldo: " + contaEspecial.getSaldo() + ", Tributos: " + contaEspecial.calculaTributos());
    }
}

