package lezione2024_03_13.Es2DispensaAstrazionePag8;

public class PersonaleATA extends Dipendente{
    public PersonaleATA(String nome, String cognome, int stipendio) {
        super(nome, cognome, stipendio);
    }

    @Override
    public String ruolo() {
        System.out.println("È un personale ATA");
        return null;
    }
}
