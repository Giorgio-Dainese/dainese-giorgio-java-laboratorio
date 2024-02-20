package esercizi15_02_24;

/**
 * @author giorgiodainese
 * Scrivere un programma che controlli se esiste una riga uguale all’interno di un array, identica alla riga di un altro array
 * 20/02/2024
 */

public class ControlloDueArray {
    public static void main(String[] args) {
        String[] array1 = {"Ciao", "zucca", "2", "Strada", "verdura"};
        String[] array2 = {"Salve", "zucca", "1", "Pista", "Orologio", "zucca", "Palla"};

        for(int i = 0; i< array1.length; i++){//for per scorrere gli elementi del primo array
            int conteggioDoppi = 0;
            for (int j = 0; j< array2.length; j++){//for per scorrere gli elementi del secondo array in modo che siano confrontati con ogni l'elemento del for precedente
                if(array1[i]==array2[j]){
                    conteggioDoppi++;
                }
            }
            if (conteggioDoppi>0){//if per verificare se ci siano doppioni
                System.out.println(array1[i]+ " ha " +conteggioDoppi+ " doppione/i nel secondo array");
            }
        }

    }//end main
}//end class
