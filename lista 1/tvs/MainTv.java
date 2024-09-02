package tvs;

public class MainTv { 
    
    public static void main (String[] args) {
        
            TV tv = new TV(5, 20);
            System.out.println("Canal inicial: " + tv.getCanal());
            System.out.println("Volume inicial: " + tv.getVolume());
    
            tv.mudarCanal(10);
            tv.aumentarVolume();
            tv.diminuirVolume();
    
            System.out.println("Novo canal: " + tv.getCanal());
            System.out.println("Novo volume: " + tv.getVolume());
    
            System.out.println("====================================");
}
}