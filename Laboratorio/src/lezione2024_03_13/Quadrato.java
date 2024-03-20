package lezione2024_03_13;

import lezione2024_03_13.intefaces.IMisurePoligono;

public class Quadrato implements IMisurePoligono {

    private Double lato;

    public Quadrato(){}
    public Quadrato(Double lato) {
        this.lato = lato;
    }

    public Double getLato() {
        return lato;
    }

    public void setLato(Double lato) {
        this.lato = lato;
    }

    @Override
    public Double calcolaPerimetro() {
        return this.lato * 4;
    }

    @Override
    public Double calcolaArea() {
        return Math.pow(this.lato,2);
    }
}
