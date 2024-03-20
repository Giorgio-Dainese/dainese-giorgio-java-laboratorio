package lezione13_03_2024.Es4DispensaAstrazionePag8;

public abstract class Vehicle {

    public String modello;

    public Vehicle(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
}
