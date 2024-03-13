package lezione13_03_2024.exceptions;

import java.util.Scanner;

public class DivisioneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Inserisci dividendo");
            double dividendo = Double.parseDouble(sc.nextLine());
            System.out.println("Inserisci divisore");
            double divisore = Double.parseDouble(sc.next());
            if (divisore == 0)
                throw new Exception("FERMA, DIVISONE PER ZERO IMPOSSIBILE");
            double risultato = dividendo / divisore;
            System.out.println(("Il risultato è: " +risultato));
        } catch (Exception ex){
            System.out.println("Exception message: " +ex.getMessage());
        }

    }
}
