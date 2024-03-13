package lezione13_03_2024.Es2DispensaAstrazionePag8;

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
