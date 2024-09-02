package quadrados;

public class MainQuadrado {
    public static void main (String[] args) {
        Quadrado quadrado = new Quadrado(5.0);
        System.out.println("Lado inicial do quadrado: " + quadrado.retornarLado());
        
        quadrado.mudarLado(10.0);
        System.out.println("Lado após mudança: " + quadrado.retornarLado());
        
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        
        System.out.println("====================================");
    }
    
}
