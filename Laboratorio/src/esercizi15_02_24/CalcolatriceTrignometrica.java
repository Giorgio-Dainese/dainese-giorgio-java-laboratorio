package esercizi15_02_24;

import java.util.Scanner;

/**
 * @author Giorgio Dainese
 * Classe che implementa Calcolatrice Classica almeno 3 operazioni trignometriche
 */
public class CalcolatriceTrignometrica
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in); //Imposto l'input
        System.out.println("Insersci il primo numero: ");
        int primoNumero = Integer.parseInt(tastiera.nextLine()); //L'input può essere messo nello switch/serie di if, per ottimizzare il codice e non chiedere, ad esempio, due numeri se scelgo l'operazione coseno.
        System.out.println("Insersci il secondo numero: ");
        int secondoNumero = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci l'angolo in gradi:");
        int angolo = Integer.parseInt(tastiera.nextLine());
        double radianti = Math.toRadians(angolo);
        System.out.println("Inserisci l'operatore che desideri utilizzare:\n" +
                "\t 1)Somma\n \t 2)Differenza\n \t 3)Prodotto \n \t 4)Divisione \n \t 5)Seno \n \t 6)Coseno \n \t 7)Tangente");
        int operatore = Integer.parseInt(tastiera.nextLine());

        switch (operatore)
        {
            case 1:
                int somma = primoNumero + secondoNumero; //definizione somma
                System.out.println("La somma é: " +somma); //imposto l'output
                break;
            case 2:
                int differenza = primoNumero-secondoNumero; //definizione differenza
                System.out.println("La differenza è: " +differenza);
                break;
            case 3:
                int prodotto = primoNumero*secondoNumero; //definizione prodotto
                System.out.println("Il prodotto è: " +prodotto);
                break;
            case 4:
                double divisione = (double) primoNumero /secondoNumero; //definizione divisione
                if (secondoNumero==0){ //Condizione della divisione per 0
                    System.out.println("La divisione è impossibile, inserisci un nuovo numero: ");
                    int divisore = 0;
                    do {
                        divisore = Integer.parseInt(tastiera.nextLine());

                    }while(divisore==0);
                    System.out.println("La divisone è: " +(primoNumero/divisore));
                } else System.out.println("La divisone è: " +divisione);
                break;
            case 5:
                double seno = Math.sin(radianti);
                System.out.println("Il seno è: " +seno);
                break;
            case 6:
                double coseno = Math.cos(radianti);
                System.out.println("Il coseno è: " +coseno);
                break;
            case 7:
                double tangente = Math.tan(radianti);
                System.out.println("La tangente è: " +tangente);
                break;
            default:
                System.out.println("Il tuo inserimento non corrisponde a nessun operatore, scegli tra gli operatori presenti nell'elenco");
                break;
        }




/*
        if (operatore==1) {
            int somma = primoNumero + secondoNumero; //definizione somma
            System.out.println("La somma é: " +somma); //imposto l'output
        } else if (operatore ==2) {
            int differenza = primoNumero-secondoNumero; //definizione differenza
            System.out.println("La differenza è: " +differenza);
        } else if (operatore == 3) {
            int prodotto = primoNumero*secondoNumero; //definizione prodotto
            System.out.println("Il prodotto è: " +prodotto);
        } else if (operatore == 4) {
            double divisione = (double) primoNumero /secondoNumero; //definizione divisione
            if (secondoNumero==0){ //Condizione della divisione per 0
            System.out.println("La divisione è impossibile ");
        } else System.out.println("La divisone è: " +divisione);
        } else if (operatore == 5) {
                double seno = Math.sin(radianti);
                System.out.println("Il seno è: " +seno);
        } else if (operatore == 6){
                double coseno = Math.cos(radianti);
                System.out.println("Il coseno è: " +coseno);
        } else if (operatore == 7){
                double tangente = Math.tan(radianti);
                System.out.println("La tangente è: " +tangente);
        }else System.out.println("Il tuo inserimento non corrisponde a nessun operatore, scegli tra gli operatori presenti nell'elenco");
        */







    }//end main
}//end class
