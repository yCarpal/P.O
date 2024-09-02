package tvs;
public class TV {
    private int canal;
    private int volume;

    public TV(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
        } else {
            System.out.println("Canal inválido. Informe um canal entre 1 e 100.");
        }
    }

    public void aumentarVolume() {
        if (this.volume < 100) {
            this.volume++;
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume--;
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolume() {
        return this.volume;
    }
}
