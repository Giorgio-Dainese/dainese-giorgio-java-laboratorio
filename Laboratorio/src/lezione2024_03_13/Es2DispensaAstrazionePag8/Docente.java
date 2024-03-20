package lezione2024_03_13.Es2DispensaAstrazionePag8;

public class Docente extends Dipendente{
    public Docente(String nome, String cognome, int stipendio) {
        super(nome, cognome, stipendio);
    }

    @Override
    public String ruolo() {
        System.out.println("È un docente");
        return null;
    }
}
