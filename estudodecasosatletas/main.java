package estudodecasosatletas;

public class main {
    public static void main(String[] args) {
        TriAtleta Leonardo = new TriAtleta("Leonardo", "-> Rua maria da gloria, 175");

        Leonardo.correr();
        Leonardo.nadar();
        Leonardo.aquecer();
        Leonardo.pedalar();
        Leonardo.imprimirDados();        
    }   
}