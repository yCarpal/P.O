public class Main {
    public static void main(String[] args) {
        ListaClientes lista = new ListaClientes();

        Clientes cli1 = new Clientes("Joice", "234.333.345-54");
        Clientes cli2 = new Clientes("João", "345.432.564-67");
        Clientes cli3 = new Clientes("Ivo", "355.422.555-78");
        Clientes cli4 = new Clientes("Ana", "444.455.355-98");
        Clientes cli5 = new Clientes("Carlos", "342.467.598-98");

        CCorrente cc1 = new CCorrente(1, 1000.0);
        cli1.addContas(cc1);

        CCorrente cc2 = new CCorrente(2, 2500.0);
        cli2.addContas(cc2);
        CCorrente cp1 = new CCorrente(3, 1000.0);
        cli2.addContas(cp1);

        CCorrente ce1 = new CCorrente(4, 1500.0);
        cli3.addContas(ce1);
        CCorrente ci1 = new CCorrente(5, 2000.0);
        cli3.addContas(ci1);

        CCorrente ci2 = new CCorrente(6, 5000.0);
        cli4.addContas(ci2);

        lista.addClientes(cli1);
        lista.addClientes(cli2);
        lista.addClientes(cli3);
        lista.addClientes(cli4);
        lista.addClientes(cli5);

        lista.imprimeClientes();
    }
}