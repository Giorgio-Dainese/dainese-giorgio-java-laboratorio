/**
 * Scrivere un programma che inserisca dei colori all’interno di un arraylist e stamparlo.
 * Scrivere un metodo che restituisca true se un colore è contenuto nella lista, false altrimenti;
 * Scrivere un metodo che restituisca l’indice del colore trovato e se non trova il colore lanci
 * un’eccezione ColorNotFoundException
 * @author Giorgio Dainese
 * 29/03/2024
 */

package esercizi2024_04_06;

import java.util.ArrayList;

public class Esercizio1 {
    public static void presenteInArraColor(String a, ArrayList arr){
    int i = 0;
        for ( i = 0; i < arr.size(); i++) {
        if (arr.get(i) == a) {
            System.out.println(true);
            break;
        } else System.out.println(false);
    }
    }

    public static void indicePresenteInArraColor(String a, ArrayList arr) {
        int i = 0;
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) == a) {
                System.out.println("Il colore " +a+ " è presente nell'indice numero " +i);
                break;
            } //else implementare eccezione
        }
    }

    public static void main(String[] args) {
        ArrayList arrColor = new ArrayList<>();
        arrColor.add("Giallo");
        arrColor.add("Verde");
        arrColor.add("Rosso");
        arrColor.add("Blu");
        arrColor.add("Grigio");
        System.out.println(arrColor);
        presenteInArraColor("Blu", arrColor);
        indicePresenteInArraColor("Blu", arrColor);
    }
}
