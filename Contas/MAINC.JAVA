
public class MAINC {
    public static void main(String[] args) {
        CPoupanca conta3 = new CPoupanca(3,1000, "Claudia",1000);
        CInvestimento conta4 = new CInvestimento(4, 1000, "Cida", 1, 12);
        CInvestimento conta5 = new CInvestimento(5, 1000, "Eva", 22, 5);
        CCorrente conta1 = new CCorrente(1, 1000, "Ana");
        CEspecial conta2 = new CEspecial(2, 2000, "Joao", 5000);
        conta3.debitar(1500);
        conta3.debitar(500);
        System.out.println("Seu saldo: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo: " + conta3.getSaldominimo());
        conta3.creditar(1500);
        System.out.println("Seu saldo: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo: " + conta3.getSaldominimo());
        conta3.atualizarSaldo();
        System.out.println("Seu saldo: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo: " + conta3.getSaldominimo());
        System.out.println("----------------------------------------");
        conta4.atualizarSaldo();
        System.out.println("Seu saldo é: " + conta4.getSaldo());
        conta5.atualizarSaldo();
        System.out.println("Seu saldo é: " + conta5.getSaldo());
    }
}

