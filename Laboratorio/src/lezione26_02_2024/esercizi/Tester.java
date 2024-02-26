package lezione26_02_2024.esercizi;

public class Tester {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gumzi", "El Guzzo", "gumzi@gumzi.guz", 1.80);
        System.out.println(persona1);

        ContoBancario conto1 = new ContoBancario(4545,"Palermo", 15548.14);
        System.out.println(conto1);
        conto1.setFiliale("Castello di Rivalta");
        System.out.println(conto1);
    }
}
