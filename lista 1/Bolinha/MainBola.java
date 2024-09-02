package Bolinha;

public class MainBola{
        public static void main(String[] args) {
       
                Bola bola = new Bola("Azul", 30.0, "Borracha");
                System.out.println("Cor inicial da bola: " + bola.mostraCor());
        
                bola.trocaCor("Vermelho");
                System.out.println("Cor após troca: " + bola.mostraCor());
        
                System.out.println("Circunferência da bola: " + bola.getCircunferencia());
                System.out.println("Material da bola: " + bola.getMaterial());
        
                System.out.println("====================================");
                
        }       
}
