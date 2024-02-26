package lezione26_02_2024.esercizi;

public class ContoBancario {
    public Integer numeroConto;
    public String filialeConto;
    public Double saldoConto;

    /**
     *
     * @param numeroConto seriale delconto con cui si vuole istanziare l'oggetto
     * @param filialeConto locazione della filiale, presso cui è stato aperto il conto, con cui si vuole istanziare l'oggetto
     * @param saldoConto disponibilità delc conto con cui si vuole istanziare l'oggetto
     */
    public ContoBancario(Integer numeroConto, String filialeConto, Double saldoConto){
        this.numeroConto = numeroConto;
        this.filialeConto = filialeConto;
        this.saldoConto = saldoConto;
    }

    public String toString(){
        return "Numero del Conto : " +numeroConto+
                "\nFiliale : " +filialeConto+
                "\nSaldo : €" +saldoConto;
    }

    public Double getSaldoConto() {
        return saldoConto;
    }

    public void setFiliale(String filialeConto){
        this.filialeConto = filialeConto;
    }
}


