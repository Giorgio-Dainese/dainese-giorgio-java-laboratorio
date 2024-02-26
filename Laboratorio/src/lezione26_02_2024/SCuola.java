package lezione26_02_2024;

/**
 * altro esempio oggetti
 */
public class SCuola {
    private String nomeScuola;
    private String indirizzoScuola;
    private String gradoScuola;

    public SCuola(){
    }
public SCuola(String nomeScuola, String indirizzoScuola, String gradoScuola) {
    this.nomeScuola = nomeScuola;
    this.indirizzoScuola = indirizzoScuola;
    this.gradoScuola = gradoScuola;
}
public void setNomeSCuola  (String nomeScuola){
this.nomeScuola = nomeScuola;
}

public String getNomeScuola(){
        return nomeScuola;
}

public String toString(){
        return "nome scuola : " +nomeScuola+ "\nindirizzo :" + indirizzoScuola+ "\ngrado : " +gradoScuola;
}
}



