package it.epicode.multimedia;

public class Immagine extends ElementoMultimediale{

    private int luminosita;

    public Immagine(String titolo, int luminosita){
        super(titolo);
        this.luminosita = luminosita;
    }
    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 1) {
            luminosita--;
        }
    }

    @Override
    public void esegui() {
        show();
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}
