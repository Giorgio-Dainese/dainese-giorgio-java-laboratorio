/**
 *Dato un arraylist di persone cercare le persone che sono nate lo stesso giorno e stampare le loro istanze.
 * @author Giorgio Dainese
 * 05/04/2024
 */

package esercizi2024_04_06;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Esercizio3 {
    public static class Persona{
        private String nome;
        private String cognome;
        private String dataNascita;

        public Persona(String nome, String cognome, String dataNascita) {
            this.nome = nome;
            this.cognome = cognome;
            this.dataNascita = dataNascita;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nome='" + nome + '\'' +
                    ", cognome='" + cognome + '\'' +
                    ", dataNascita='" + dataNascita + '\'' +
                    '}';
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

        public String getDataNascita() {
            return dataNascita;
        }

        public void setDataNascita(String dataNascita) {
            this.dataNascita = dataNascita;
        }
    }//end Persona

    public static void main(String[] args) {
        Persona p1 = new Persona("Giorgio", "Gumzi", "10-03-1956");
        Persona p2 = new Persona("Christian", "Folle", "16-12-1976");
        Persona p3 = new Persona("Sgabox", "Delia", "10-03-1956");
        Persona p4 = new Persona("Sossio", "Aruzio", "05-08-2003");
        ArrayList<Persona> arrayPersone = new ArrayList<>();
        arrayPersone.add(p1);
        arrayPersone.add(p2);
        arrayPersone.add(p3);
        arrayPersone.add(p4);

        for (int i = 0; i < arrayPersone.size(); i++) {
            for (int j = i+1; j < arrayPersone.size(); j++) {
                if (arrayPersone.get(i).getDataNascita().equals(arrayPersone.get(j).getDataNascita())){
                    System.out.println(arrayPersone.get(i).toString());
                    System.out.println(arrayPersone.get(j).toString());
                }
            }
        }
    }//end main
}//end class
