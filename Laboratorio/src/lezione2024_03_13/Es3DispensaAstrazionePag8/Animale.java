package lezione2024_03_13.Es3DispensaAstrazionePag8;

public abstract class Animale {
    private String specie;

    public Animale(String specie) {
        this.specie = specie;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public abstract String sound();
}

