package esercizi2024_02_26;

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
    public static void ControlloPasswords(String stringa) {
        //Lettere e cifre

        //Cifre > 1
        int contatoreCifre = 0;
        boolean boolCifre = false, boolCaratteri = false;
        String caratteriAmmessi ="0123456789abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";

        char c;
        for (int i = 0; i < stringa.length(); i++) {
            c = stringa.charAt(i);
            if(!caratteriAmmessi.contains(String.valueOf(c))){
            boolCaratteri = false;
                break;

            } else boolCaratteri = true;;

            if ( Character.isDigit(c) ) {
                contatoreCifre++;
            }
            if (contatoreCifre > 1) {
                boolCifre = true;
            } else boolCifre = false;


        }
        if (stringa.length() > 7 && boolCaratteri && boolCifre){
            System.out.println("La password fornita rispetta i criteri di validità");
        }

        System.out.println("Numero cifre: " +contatoreCifre+ "\nBoolCifre " +boolCifre+ "\nboolCaratteri " +boolCaratteri);

    }

    public static void main(String[] args) {
        ControlloPasswords("Saverio00!");
    }
}//end class
