package esercizi26_02_2024;

import java.util.ArrayList;

/**
 * @author giorgiodainese
 * Controllare che all’interno di un array sia presente un determinato elemento e stamparne l’indice
 *
 * 23/02/2024
 */
public class TrovaElementoArray {

    public static void StamoaIndiceElementoArray(String [] arr, String elemento){
        boolean nonTrovato = true;
        for (int  i = 0; i < arr.length; i++){
            if(arr[i].equals(elemento)){
                System.out.println("L'elemento " +elemento+ " si trova nell'indice " +i);
                nonTrovato = false;
            }
        }
        if(nonTrovato){
            System.out.println(("L'elemento " +elemento+ ", cercato nell'array, non esiste"));
        }
    }
    public static void main(String[] args) {
        String [] array = {"Luca", "Sandro", "Saverio", "Serafino"};
        StamoaIndiceElementoArray(array, "Saverio");
        StamoaIndiceElementoArray(array, "Beppe");
    }//end main
}//end class
