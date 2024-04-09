/**
 *Data una lista di persone, stampare le persone che sono nate in un mese X
 *      -Modificare il campo «soprannome» della prima persona trovata
 * @author Giorgio Dainese
 * 06/04/2024
 */

package esercizi2024_04_06;

import java.util.ArrayList;

public class Esercizio4 {

    public static class Persona{
        private String nome;
        private String soprannome;
        private int meseNascita;

        public Persona(String nome, String soprannome, int meseNascita) {
            this.nome = nome;
            this.soprannome = soprannome;
            this.meseNascita = meseNascita;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nome='" + nome + '\'' +
                    ", soprannome='" + soprannome + '\'' +
                    ", meseNascita=" + meseNascita +
                    '}';
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSoprannome() {
            return soprannome;
        }

        public void setSoprannome(String soprannome) {
            this.soprannome = soprannome;
        }

        public int getMeseNascita() {
            return meseNascita;
        }

        public void setMeseNascita(int meseNascita) {
            this.meseNascita = meseNascita;
        }
    }//end Persona

    public static void cercaPersonaPerMese(int mese, ArrayList<Persona> array){
        boolean soprannomePrimaPersonaModificato = false;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).meseNascita == mese) {
                if (!soprannomePrimaPersonaModificato){
                    array.get(i).setSoprannome(array.get(i).getSoprannome()+"TROVATO");
                    soprannomePrimaPersonaModificato = true;
                }
                System.out.println(array.get(i).toString());
            }

        }
    }//end method

    public static void main(String[] args) {
        ArrayList<Persona> arrayPersone = new ArrayList<>();
        Persona p1 = new Persona("Gabriele", "Sgabòx", 9);
        Persona p2 = new Persona("Christian", "Chri Il Pazzo", 10);
        Persona p3 = new Persona("Andrea", "Aruzio", 3);
        Persona p4 = new Persona("Bera", "Lupo", 5);
        Persona p5 = new Persona("Andrea", "Il Gringo", 11);
        Persona p6 = new Persona("Giorgio", "Guzzi", 3);
        Persona p7 = new Persona("Filippo", "Er Mejo", 4);
        arrayPersone.add(p1);
        arrayPersone.add(p2);
        arrayPersone.add(p3);
        arrayPersone.add(p4);
        arrayPersone.add(p5);
        arrayPersone.add(p6);
        arrayPersone.add(p7);
        cercaPersonaPerMese(3,arrayPersone);
    }

}//end class
