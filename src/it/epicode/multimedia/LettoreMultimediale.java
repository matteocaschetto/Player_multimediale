package it.epicode.multimedia;

import java.util.Scanner;

public class LettoreMultimediale {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        elementi[0] = new Immagine("Immagine 1", 5);
        elementi[1] = new Audio("Audio 1", 3, 2);
        elementi[2] = new Video("Video 1", 4, 3, 2);
        elementi[3] = new Audio("Audio 2", 2, 3);
        elementi[4] = new Video ("Video 2", 2,4,4);


        while (true) {
            System.out.println("Scegli un numero da 1 a 5 per eseguire un elemento multimediale, 0 per uscire.");
            for (int i = 0; i < elementi.length; i++) {
                System.out.println((i + 1) + ". " + elementi[i].getTitolo());
            }

            int scelta = scanner.nextInt();

            if (scelta == 0) {
                break;
            }

            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else {
                System.out.println("Scelta non valida, Riprova.");
            }
        }

        scanner.close();
    }
}
