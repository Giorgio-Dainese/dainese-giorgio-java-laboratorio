package esercizi26_02_2024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author giorgiodainese
 * Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono pari;
 *
 * Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono dispari;
 *
 * 23/02/2024
 */
public class NumeriPariEDispari {
    public static void ControlloTuttiPari(int N, Scanner scan){
        ArrayList<String> array = new ArrayList<>();
        boolean pari = true;
        for (int i = 0; i < N; i++){
            System.out.println("Inserisci un numero");
            String numero = scan.nextLine();
            array.add(numero);
        }
        for (int j = 0; j < N; j++){
            if(Integer.parseInt(array.get(j))%2!=0){
                System.out.println("Non tutti i numeri sono pari");
                pari = false;
                break;
            }
        }
        if(pari){
            System.out.println("Tutti i numeri sono pari");
        }
    }

    public static void ControlloTuttiDispari(int N, Scanner scan){
        ArrayList<String> array = new ArrayList<>();
        boolean dispari = true;
        for (int i = 0; i < N; i++){
            System.out.println("Inserisci un numero");
            String numero = scan.nextLine();
            array.add(numero);
        }
        for (int j = 0; j < N; j++){
            if(Integer.parseInt(array.get(j))%2==0){
                System.out.println("Non tutti i numeri sono dispari");
                dispari = false;
                break;
            }
        }
        if(dispari){
            System.out.println("Tutti i numeri sono dispari");
        }
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ControlloTuttiPari(5, tastiera);
    }//end main
}//end class
