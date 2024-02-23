package esercizi26_02_2024;

/**
 * @author giorgiodainese
 * Scrivere un metodo che controlli se una stringa in input sia una possibile password valida:
 *      -Lunghezza minima di 8 caratteri;
 *      -Contiene solo lettere e numeri;
 *      -Deve contenere almeno 2 cifre;
 *
 * 23/02/2024
 */
public class ControlloPassword {
    public static void ControlloPassword(String stringa) {
        //Lettere e cifre


        //Cifre > 1
        int contatoreCifre = 0;
        boolean boolCifre;
        for (int i = 0; i < stringa.length(); i++) {
            char c = stringa.charAt(i);
            if (c >= 0 && c < 11) {
                contatoreCifre++;
            }
            if (contatoreCifre > 1) {
                boolCifre = true;
            } else boolCifre = false;

        }            //if (stringa.length() > 7 && "Lettere e Numeri" && boolCifre)

    }
}//end class
