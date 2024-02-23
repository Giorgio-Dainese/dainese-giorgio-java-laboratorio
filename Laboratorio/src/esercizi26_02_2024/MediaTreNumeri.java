package esercizi26_02_2024;

/**
 * @author giorgiodainese
 * Scrivere un metodo che esegua la media tra tre numeri
 * 23/02/2024
 */
public class MediaTreNumeri {
    public static double MediaTreNumeri(double num1, double num2, double num3) {
        double somma = (num1 + num2 + num3);
        return somma/3;
    }

    public static void main(String[] args) {
        System.out.println(MediaTreNumeri(1,2,5));
    }//end main
}//end class
