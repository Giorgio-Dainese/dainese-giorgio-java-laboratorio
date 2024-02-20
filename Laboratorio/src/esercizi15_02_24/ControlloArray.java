package esercizi15_02_24;

/**
 * @author giorgiodainese
 * Scrivere un programma che controlli se vi sono due righe all’interno di un array uguali.
 * 20/02/2024
 */

public class ControlloArray {
    public static void main(String[] args) {
        String[] array2 = {"Ciao", "zucca", "2", "Strada", "zucca"};
        for(int i = 0; i < array2.length; i++){//for per ogni elemento
            int conteggioDoppi = 0;
            for(int j = 0; j < array2.length; j++){//for per confrontare ogni elemento i con tutti gli elementi dell'array
                if(array2[i]==array2[j]){
                    conteggioDoppi ++;

                }
            }
            if(conteggioDoppi>1){
                System.out.println(array2[i]+ " in posizione " +i+ " contiene almeno un doppione ");
            }//if per verificare i veri doppioni. Con i due for ogni elemento è visto come il doppio
            // di se stesso e il conteggioDoopi è 1, se aumenta a 2 significa che è statp trpvato un
            //effettivo doppione nell'array
        }
    }//end main
}//end class
