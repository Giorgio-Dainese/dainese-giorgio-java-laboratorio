package lezione13_03_2024.Es2DispensaAstrazionePag8;

public abstract class Dipendente {
    public String nome;
    public String cognome;
    public int stipendio;

    public Dipendente(String nome, String cognome, int stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int stipendio() {
        return stipendio;
    }

    public void setRuolo(int stipendio) {
        this.stipendio = stipendio;
    }

    public abstract String ruolo();
}
