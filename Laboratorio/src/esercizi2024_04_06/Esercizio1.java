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

    public static class ColorNotFoundException extends Exception{
        public ColorNotFoundException(){super("Attenzione, colore non trovato!");}
    }

    public static boolean presenteInArrColor(String a, ArrayList arr){
    int i = 0;
    boolean presente = false;
        for ( i = 0; i < arr.size(); i++) {
        if (arr.get(i) == a)
            presente = true;
    }
        return presente;
    }
    public static void indicePresenteInArrColor(String a, ArrayList arr) {
        int indice = 0;
        boolean presente = false;
        for ( int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == a) {
                presente = true;
                indice = i;
            }
        }
        try {
            if (!presente)
                throw new ColorNotFoundException();
            else System.out.println("Il colore cercayo è all'indice " +indice);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        ArrayList arrColor = new ArrayList<>();
        arrColor.add("Giallo");
        arrColor.add("Verde");
        arrColor.add("Rosso");
        arrColor.add("Blu");
        arrColor.add("Grigio");
        System.out.println(presenteInArrColor("Blu", arrColor));
        indicePresenteInArrColor("Giallo", arrColor);
    }
}
