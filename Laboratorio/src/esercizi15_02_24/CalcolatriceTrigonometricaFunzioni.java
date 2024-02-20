package esercizi15_02_24;

import java.util.Scanner;

/**
 * @author Giorgio Dainese
 * -Classe che implementa Calcolatrice Classica almeno 3 operazioni trignometriche, usando le funzioni
 * -Chiedere all’utente se vuole rieseguire un calcolo, premendo la lettera ‘y’, altrimenti termina il programma
 * -Implementare un pezzo di codice che permetta di controllare se un numero è divisibile per 2, 3, 4, 5
 * -implementare una funzione che permetta di vedere se un qualsiasi numero X sia divisibile per un qualsiasi numero y
 * 20/02/2024
 * **/


public class CalcolatriceTrigonometricaFunzioni {

    public static int Somma(int numero1, int numero2) {
        return numero1 + numero2;
    }//metodo per calcolare la somma

    public static int Differenza(int numero1, int numero2) {
        return numero1 - numero2;
    }//metodo per calcolare la differenza

    public static int Prodotto(int numero1, int numero2) {
        return numero1 * numero2;
    }//metodo per calcolare il prodotto

    public static double Divisione(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("La divisione è impossibile ");
        }//Condizione della divisione per 0
        return numero1 / numero2;
    }//metodo per calcolare la divisione

    public static double Seno(int angle){
        double radianti = Math.toRadians(angle);
        return Math.sin(radianti);
    }//metodo per calcolare il seno
    public static double Coseno(int angle){
        double radianti = Math.toRadians(angle);
        return Math.cos(radianti);
    }//metodo per calcolare il coseno
    public static double Tangente(int angle){
        double radianti = Math.toRadians(angle);
        return Math.tan(radianti);
    }//metodo per calcolare la tangente
    public void Divisibile(int X, int y) {
        if(X%y==0){
            System.out.println(X+ "è divisibile per " +y);
        } else System.out.println(X+ "NON è divisibile per " +y);
    }//metodo per controllare la divisibilità di un numero X per un numero y

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in); //Imposto l'input
        boolean continua = true;
        while (continua) {//while per fare un nuovo calcolo nel caso venisse premuto y alla fine
            System.out.println("Insersci il primo numero: ");
            int primoNumero = Integer.parseInt(tastiera.nextLine()); //L'input può essere messo nello switch/serie di if, per ottimizzare il codice e non chiedere, ad esempio, due numeri se scelgo l'operazione coseno.
            System.out.println("Insersci il secondo numero: ");
            int secondoNumero = Integer.parseInt(tastiera.nextLine());

            //controlo divisibilità di un numero per 2, 3, 4, 5
            for(int i = 2; i < 6; i++){
                if( primoNumero%i==0){
                    System.out.println("Il primo numero è divisibile per " +i);
                } else System.out.println("Il primo numero NON è divisibile per " +i);
            }

            System.out.println("Inserisci l'angolo in gradi:");
            int angolo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci l'operatore che desideri utilizzare:\n" +
                    "\t 1)Somma\n \t 2)Differenza\n \t 3)Prodotto \n \t 4)Divisione \n \t 5)Seno \n \t 6)Coseno \n \t 7)Tangente");
            int operatore = Integer.parseInt(tastiera.nextLine());

            switch (operatore) {
                case 1:
                    System.out.println(Somma(primoNumero, secondoNumero)); //stampo la somma
                    break;
                case 2:
                    System.out.println(Differenza(primoNumero, secondoNumero));//stampo la differenza
                    break;
                case 3:
                    System.out.println(Prodotto(primoNumero, secondoNumero));//stampo il prodotto
                    break;
                case 4:
                    System.out.println(Divisione(primoNumero, secondoNumero));//stampo la divisione
                    break;
                case 5:
                    System.out.println(Seno(angolo));//stampo il seno
                    break;
                case 6:
                    System.out.println(Coseno(angolo));//stampo il coseno
                    break;
                case 7:
                    System.out.println(Tangente(angolo));//stampo la tangente
                    break;
                default:
                    System.out.println("Il tuo inserimento non corrisponde a nessun operatore, scegli tra gli operatori presenti nell'elenco");
                    break;
            }
            System.out.println("Premi y per un nuovo calcolo, premi un tasto per uscire");
            String decisione = tastiera.nextLine();
            if (!decisione.equals("y")) {
                continua = false;//assegnazione per uscire dal while
            }
        }//end while
        System.out.println("Programma terminato");
    }//end main
}//end class