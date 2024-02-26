package lezione26_02_2024.esercizi;

public class Persona {
    public String nomePersona;
    public String cognomePersona;
    public String mailPersona;
    public Double altezzaPersona;

    public Persona() {
    }

    /**
     *
     * @param nomePersona nome della persona con cui si vuole istanziare l'oggetto
     * @param cognomePersona cognome della persona con cui si vuole istanziare l'oggetto
     * @param mailPersona mail della persona con cui si vuole istanziare l'oggetto
     * @param altezzaPersona altezza della persona con cui si vuole istanziare l'oggetto
     */
    public Persona(String nomePersona, String cognomePersona, String mailPersona, Double altezzaPersona) {
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.mailPersona = mailPersona;
        this.altezzaPersona = altezzaPersona;
    }

    public String toString(){
        return "Nome : " +nomePersona+
                "\nCognome : " +cognomePersona+
                "\nMail : " +mailPersona+
                "\nAltezza : " +altezzaPersona;
    }

    public String getNomePersona() {
        return nomePersona;
    }

    public void setNomePersona(String nomePersona) {
        this.nomePersona = nomePersona;
    }
}


