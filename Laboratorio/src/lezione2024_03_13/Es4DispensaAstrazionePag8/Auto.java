package lezione2024_03_13.Es4DispensaAstrazionePag8;

public class Auto extends Vehicle {
    public Auto(String modello) {
        super(modello);
    }

    @Override
    public void startEngine() {
        String ret = "| Maranello NA V12 started     |";
        System.out.println(ret);
    }

    @Override
    public void stopEngine() {
        System.out.println("| Maranello NA V12 shutted down     |");
    }
}
