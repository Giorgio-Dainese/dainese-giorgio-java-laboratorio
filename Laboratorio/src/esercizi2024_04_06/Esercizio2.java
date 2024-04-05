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

    public static class PersonaAlreadyExistException extends Exception{
        public PersonaAlreadyExistException(){super("La persona che si vuole inserire esiste già!");}
    }

    public static class PersonaNotFoundException extends Exception{
        public PersonaNotFoundException(){super("La persona cercata non esiste!");}
    }
    public static void ricercaPerCF(String paramCF, ArrayList<Persona> p){
       try {
           boolean corrispondezaCF = false;
           for (int i = 0; i < p.size(); i++) {
               if (p.get(i).getCF().equals(paramCF)) {
                   corrispondezaCF = true;
                   System.out.println(p.get(i).getNome() + " " + p.get(i).getCognome() + " " + p.get(i).getCF());
               }
           }
           if (!corrispondezaCF)
               throw new PersonaNotFoundException();


       } catch (PersonaNotFoundException e){
           System.out.println(e.getMessage());
       }
    }


    public static void main(String[] args) {
        Persona p1 = new Persona("Giorgio", "Gumzi", "GRGGMZ98");
        Persona p2 = new Persona("Christian", "Folle", "CHRFLL00");
        Persona p3 = new Persona("Sgabox", "Delia", "SGBDLE00");
        ArrayList<Persona> arrayPersone = new ArrayList<>();
        arrayPersone.add(p1);
        arrayPersone.add(p2);
        arrayPersone.add(p3);
        try{
            Persona p4 = new Persona("Sossio", "Aruzio", "SGBDLE00");
            if (p4.getCF().equals(p1.getCF()) || p4.getCF().equals(p2.getCF()) || p4.getCF().equals(p3.getCF()))
                throw new PersonaAlreadyExistException();
            arrayPersone.add(p4);
        } catch(PersonaAlreadyExistException e){
            System.out.println(e.getMessage());
        }

        ricercaPerCF("SGBDLE00", arrayPersone);

    }//end main
}//end class
