package lezione26_02_2024;

/**
 *
 * @author Giorgio Dainese
 */
public class EsempioOggetti {
    public String nomePersona;
    public String cognomePersona;
    public Integer etaPersona;

    public EsempioOggetti(){

    }

    /**
     * Costruttore
     * @param nomePersona nome della persona con cui si vuole istanziare l'oggetto
     * @param cognomePersona cognome della persona con cui si vuole istanziare l'oggetto
     */
    public EsempioOggetti(String nomePersona, String cognomePersona){
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
    }

    /**
     *
     * @param nomePersona nome della persona con cui si vuole istanziare l'oggetto
     * @param cognomePersona cognome della persona con cui si vuole istanziare l'oggetto
     * @param etaPersona età della persona con cui si vuole istanziare l'oggetto
     */
    public EsempioOggetti(String nomePersona, String cognomePersona, Integer etaPersona){
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.etaPersona = etaPersona;
    }

    public String toString(){
        return  "Nome " +nomePersona+
                "   Cognome " +cognomePersona+
                "   Età " +(etaPersona == null ? 0 : etaPersona); //Operatore ternario per evitare il null in stampa (nel caso di uso del costruttore senza età
    }

}
