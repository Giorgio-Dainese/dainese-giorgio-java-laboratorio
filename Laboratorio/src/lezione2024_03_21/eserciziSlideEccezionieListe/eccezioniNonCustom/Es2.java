package lezione2024_03_21.eserciziSlideEccezionieListe.eccezioniNonCustom;

import java.lang.reflect.Array;

/**
 *Scrivere una funzione che dato un array di numeri, lanci una eccezione nel caso in cui ci sia un numero negativo
 * @author Giorgio Dainese
 * 30/03/2024
 */
public class Es2 {
    public static void controlloNumNegativo (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] < 0) {
                    throw new Exception("È presente un negativo");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nummeri = {1,2,-3,4,5,-6};
        controlloNumNegativo(nummeri);
    }

}
