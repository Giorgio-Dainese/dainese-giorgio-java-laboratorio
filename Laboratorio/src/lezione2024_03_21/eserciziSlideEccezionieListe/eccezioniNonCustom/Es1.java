package lezione2024_03_21.eserciziSlideEccezionieListe.eccezioniNonCustom;
/**
 * Scrivere una funzione che dato un numero intero, lanci un eccezione se il numero inserito è pari
 * @author Giorgio Dainese
 * 21/03/2024
 */
public class Es1 {

    public static void eccezionePari(int numero) throws Exception {
        try {
            if (numero % 2 == 0)
                throw new Exception("Attenzione, il numero è pari");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws Exception {
        eccezionePari (10);
    }//end main
}//end class
