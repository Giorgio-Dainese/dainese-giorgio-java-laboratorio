package com.biglietteria.model; //Perché mi dà errore sul  package in relazione al file path?



import java.io.Serializable;




public class Biglietteria implements Serializable {
    private String codiceBiglietteria;
    private String indirizzo;
    private String nomeBiglietteria;

    public Biglietteria(String codiceBiglietteria, String indirizzo, String nomeBiglietteria) {
        this.codiceBiglietteria = codiceBiglietteria;
        this.indirizzo = indirizzo;
        this.nomeBiglietteria = nomeBiglietteria;
    }

    public String getCodiceBiglietteria() {
        return codiceBiglietteria;
    }

    public void setCodiceBiglietteria(String codiceBiglietteria) {
        this.codiceBiglietteria = codiceBiglietteria;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNomeBiglietteria() {
        return nomeBiglietteria;
    }

    public void setNomeBiglietteria(String nomeBiglietteria) {
        this.nomeBiglietteria = nomeBiglietteria;
    }
}
