package lezione2024_03_21.eserciziSlideEccezionieListe.eccezioniNonCustom;
/**
 *Scrivere una funzione che data una stringa, lanci un’eccezione se la stringa non contiene vocali.
 * @author Giorgio Dainese
 * 21/03/2024
 */
public class Es3 {
    public static void controlloAssenzaVocali(String str){
    String vocali = "aeiouAEIOU";
    boolean presenzaVocale = false;
    char c;
    try {
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(vocali.contains(String.valueOf(c))){
                presenzaVocale = true;
                break;
            }
        }
        if(!presenzaVocale)
            throw new Exception ("Non ci sono vocali");

    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }
    public static void main(String[] args) {
        controlloAssenzaVocali("csxz");
    }
}//end class
