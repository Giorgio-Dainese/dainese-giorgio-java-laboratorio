package lezione13_03_2024.Es3DispensaAstrazionePag8;

public class Leone extends Animale{
    public Leone(String specie) {
        super(specie);
    }

    @Override
    public String sound() {
        return "roar";
    }
}
