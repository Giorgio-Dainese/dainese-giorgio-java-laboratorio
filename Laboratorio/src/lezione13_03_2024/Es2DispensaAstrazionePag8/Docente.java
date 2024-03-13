package lezione13_03_2024.Es2DispensaAstrazionePag8;

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
