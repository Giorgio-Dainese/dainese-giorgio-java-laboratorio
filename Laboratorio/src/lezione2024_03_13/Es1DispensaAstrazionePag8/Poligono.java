package lezione2024_03_13.Es1DispensaAstrazionePag8;

public abstract class Poligono {
    private int numeroLati;
    private double lato;

    public Poligono(int numeroLati, double lato) {
        this.numeroLati = numeroLati;
        this.lato = lato;
    }

    public Poligono() {

    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public abstract Double calcolaPerimetro();
    public abstract Double calcolaArea();
}
