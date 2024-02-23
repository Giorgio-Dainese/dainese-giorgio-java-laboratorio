package esercizi26_02_2024;

/**
 * @author giorgiodainese
 * Scrivere un programma che calcoli la somma della diagonale principale di una matrice
 *
 * 23/02/2026
 */
public class SommaDiagonaleMatrice {
    public static void main(String[] args) {
        int [][] matrice = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sommaMatrice = 0;
        for (int i = 0; i < matrice.length; i++){
            sommaMatrice += matrice[i][i];
        }
        System.out.println("La somma della diagonale principale è: " +sommaMatrice);
    }//end main
}//end class
