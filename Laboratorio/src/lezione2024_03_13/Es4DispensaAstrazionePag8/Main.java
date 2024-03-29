package lezione2024_03_13.Es4DispensaAstrazionePag8;

public class Main {
    public static void main(String[] args) {
        Auto Ferrari = new Auto("812");
        Moto Ducati = new Moto("Superleggera");

        System.out.println("+------------------------------+");
        Ferrari.startEngine();
        System.out.println("+------------------------------+");
        Ducati.startEngine();
        System.out.println("+------------------------------+");
        System.out.println(" Il garage è molto rumoroso");
        System.out.println();
        System.out.println("+-----------------------------------+");
        Ferrari.stopEngine();
        System.out.println("+-----------------------------------+");
        Ducati.stopEngine();
        System.out.println("+-----------------------------------+");
        System.out.println("Il garage è silenzioso");
    }
}
