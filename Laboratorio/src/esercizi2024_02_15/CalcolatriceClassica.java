package esercizi2024_02_15;

import java.util.Scanner;

/**
 * @author Giorgio Dainese
 * Classe che implementa il primo esercizio che si occupa di creare una calcolatrice classica, ovvero,
 * una calcolatrice che implementa le 4 operazioni fondamentali
 */
public class CalcolatriceClassica
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in); //Imposto l'input
        System.out.println("Insersci il primo numero: ");
        int primoNumero = Integer.parseInt(tastiera.nextLine());
        System.out.println("Insersci il secondo numero: ");
        int secondoNumero = Integer.parseInt(tastiera.nextLine());
        int somma = primoNumero+secondoNumero; //definizione somma
        int differenza = primoNumero-secondoNumero; //definizione differenza
        int prodotto = primoNumero*secondoNumero; //definizione prodotto
        double divisione =  (double) primoNumero /secondoNumero; //definizione divisione
        System.out.println("La somma é: " +somma); //imposto l'output
        System.out.println("La differenza è: " +differenza);
        System.out.println("Il prodotto è: " +prodotto);
        if (secondoNumero==0) //Condizione della divisione per 0
        {
            System.out.println("La divisione è impossibile ");
        } else System.out.println("La divisone è: " +divisione);



    } //end main
}//end class
