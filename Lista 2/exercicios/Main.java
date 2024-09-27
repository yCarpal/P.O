package exercicios;
public class Main {
    public static void main(String[] args) {
       
        Ingresso ingresso = new Ingresso(100);
        ingresso.imprimeValor();

        VIP vip = new VIP(100, 50);
        System.out.println("Valor do ingresso VIP: R$ " + vip.getValorVIP());

        Normal normal = new Normal(100);
        normal.imprimeTipo();

        CamaroteInferior camaroteInferior = new CamaroteInferior(100, 50, "Setor A");
        camaroteInferior.imprimeLocalizacao();
        System.out.println("Valor do ingresso Camarote Inferior: R$ " + camaroteInferior.getValorVIP());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100, 50);
        System.out.println("Valor do ingresso Camarote Superior: R$ " + camaroteSuperior.getValorVIP());

       
        System.out.println("------------------------------------------------");

        
        Empregado empregado = new Empregado("José", 3000);
        System.out.println("Novo salário do empregado: " + empregado.aumentoSalario(10));

        Chefe chefe = new Chefe("Maria", 8000, 2000);
        System.out.println("Novo salário do chefe: " + chefe.aumentoSalario(10));

        Estagiario estagiario = new Estagiario("Ana", 1500, 200);
        System.out.println("Novo salário do estagiário: " + estagiario.aumentoSalario(10));

     
        System.out.println("------------------------------------------------");

        
        Tecnico tecnico = new Tecnico("Carlos", "Rua A", "9999-9999", "carlos@empresa.com", 12345, 500);
        System.out.println("Nome: " + tecnico.getNome() + ", Matrícula: " + tecnico.getNumeroMatricula());

        Administrativo administrativo = new Administrativo("Paula", "Rua B", "8888-8888", "paula@empresa.com", 54321, "Noite", 300);
        System.out.println("Nome: " + administrativo.getNome() + ", Matrícula: " + administrativo.getNumeroMatricula());

       
        System.out.println("------------------------------------------------");

        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.latir();
        gato.miar();

        cachorro.caminhar();
        gato.caminhar();

       
        System.out.println("------------------------------------------------");

        
        PessoaPobre pessoaPobre = new PessoaPobre("João");
        PessoaRica pessoaRica = new PessoaRica("Clara");

        pessoaPobre.trabalhar();
        pessoaRica.fazerCompras();
    }
}