public class TV {
    private int canal;
    private int volume;

    public TV() {
        this.canal = 1;
        this.volume = 10;
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {  // Supondo que os canais válidos são de 1 a 100
            this.canal = novoCanal;
        } else {
            System.out.println("Canal inválido. Deve estar entre 1 e 100.");
        }
    }

    public void aumentarVolume() {
        if (this.volume < 100) {  // Volume máximo é 100
            this.volume++;
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {  // Volume mínimo é 0
            this.volume--;
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public void exibirStatus() {
        System.out.println("Canal: " + this.canal + ", Volume: " + this.volume);
    }
}