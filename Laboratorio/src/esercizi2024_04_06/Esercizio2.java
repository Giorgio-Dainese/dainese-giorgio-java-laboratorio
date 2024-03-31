/**
 * Scrivere un programma che dato un oggetto persona, inserisca all’interno di un arraylist più persone;
 * Inserire una persona controllando se esiste già una persona con lo stesso CF. Se esiste PersonaAlreadyExistException;
 * Creare un metodo e cercare una persona mediante il CF e restituire l’istanza della persona trovata, altrimenti
 * PersonaNotFoundException.
 * @author Giorgio Dainese
 * 29/03/2024
 */
package esercizi2024_04_06;

import java.util.ArrayList;

public class Esercizio2 {
    public static class Persona{
        private String nome;
        private String cognome;
        private String CF;

        public Persona(String nome, String cognome, String CF) {
            this.nome = nome;
            this.cognome = cognome;
            this.CF = CF;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCognome() {
            return cognome;
        }

        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public String getCF() {
            return CF;
        }

        public void setCF(String CF) {
            this.CF = CF;
        }
    }//end persona

    public static void cercaPersona(String paramCF, ArrayList arr){
        for (int i = 0; i < arr.size(); i++) {
            //come accedere all'attributo nome dell'oggetto presente nell'array?
        }
    }



    public static void main(String[] args) {
        Persona p1 = new Persona("Giorgio", "Gumzi", "GRGGMZ98");
        Persona p2 = new Persona("Christian", "Folle", "CHRFLL00");
        Persona p3 = new Persona("Sgabox", "Delia", "SGBDLE00");
        ArrayList array = new ArrayList<>();
        array.add(p1);
        array.add(p2);
        array.add(p3);
        System.out.println(array.getFirst()); //Come stampare istanza dell'ggetto anziché cella di memoria?
    }//end main
}//end class
