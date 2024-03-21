package lezione2024_03_21;

import java.util.Scanner;

/**
 * Inserire numero N appartenente agli interi e calcolare radice qaudrata.
 * Se N >= 0 va bene. Se N < 0 lanciare errore
 * @author Giorgio Dainese
 * 21/03/2024
 */
public class EsercizioEccezioni {
    public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("Inserisci il numero: ");
           int N = Integer.parseInt(sc.nextLine());
           if (N >= 0) {
               double sqrt = Math.sqrt(N);
               System.out.println("La radice quadrata di " + N + " è: " + sqrt);
           } else throw new Exception("La radice di un negativo non si può fare");
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }//end main
}//end class
