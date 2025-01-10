package it.epicode.multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int durata;
    private int volume;
    private int luminosita;

    public  Video(String titolo, int durata, int volume, int luminosita){

        super (titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public int getDurata() {
        return durata;
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
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*" .repeat(luminosita));
        }
    }

    @Override
    public void esegui() {
        play();
    }


}
