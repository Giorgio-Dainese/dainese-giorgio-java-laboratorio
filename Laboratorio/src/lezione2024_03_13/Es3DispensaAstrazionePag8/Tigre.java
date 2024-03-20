package lezione2024_03_13.Es3DispensaAstrazionePag8;

public class Tigre extends Animale{
    public Tigre(String specie) {
        super(specie);
    }

    @Override
    public String sound() {

        return "miao";
    }
}
