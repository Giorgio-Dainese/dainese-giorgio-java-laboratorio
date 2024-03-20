package lezione2024_03_13.Es4DispensaAstrazionePag8;

public class Moto extends Vehicle {
    public Moto(String modello) {
        super(modello);
    }

    @Override
    public void startEngine() {
        System.out.println("| Borgo Panigale NA V4 started |");
    }

    @Override
    public void stopEngine() {
        System.out.println("| Borgo Panigale NA V4 shutted down |");
    }
}
