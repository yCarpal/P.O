package Lista3.Ex1;

public class Mai {
    public static void main(String[] args) {
        Cliente joice = new Cliente("Joice");
        joice.adicionarConta(new Conta(1, 1000.0));

        Cliente joao = new Cliente("João");
        joao.adicionarConta(new Conta(2, 2500.0));
        joao.adicionarConta(new Conta(3, 1000.0));

        Cliente ivo = new Cliente("Ivo");
        ivo.adicionarConta(new Conta(4, 1500.0));
        ivo.adicionarConta(new Conta(5, 2000.0));

        Cliente ana = new Cliente("Ana");
        ana.adicionarConta(new Conta(6, 5000.0));

        Cliente carlos = new Cliente("Carlos");

        List<Cliente> clientes = List.of(joice, joao, ivo, ana, carlos);
        clientes.forEach(System.out::println);
    }
}