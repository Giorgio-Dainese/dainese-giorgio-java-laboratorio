package lezione13_03_2024;

import lezione13_03_2024.intefaces.IMisurePoligono;

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
