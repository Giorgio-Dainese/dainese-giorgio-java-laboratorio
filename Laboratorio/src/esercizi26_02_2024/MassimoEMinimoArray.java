package esercizi26_02_2024;

/**
 * @author giorgiodainese
 * Scrivere un programma che trovi il massimo ed il minimo di un elemento all’interno di un array
 *
 * 24/02/2024
 */
public class MassimoEMinimoArray {

    public static void main(String[] args) {
        //Array numerici
        int [] arrayNumeri = {1324124,46342,765,345,2323,674,24235467};
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arrayNumeri.length; i++){
            if (arrayNumeri[i] < minNum){
                minNum = arrayNumeri[i];
            }
            if (arrayNumeri[i] > maxNum){
                maxNum = arrayNumeri[i];
            }
        }
        System.out.println("MIN : " +minNum+ "\nMAX : " +maxNum);


        //Array di stringhe

        String [] arrayStringhe = {"b", "c", "d", "a"};
        String minString = arrayStringhe[0];
        String maxString = arrayStringhe[0];
        for (int i = 0; i < arrayStringhe.length; i++){
            if (arrayStringhe[i].compareTo(minString) < 0){
                minString = arrayStringhe[i];
            }
            if (arrayStringhe[i].compareTo(maxString) > 0){
                maxString = arrayStringhe[i];
            }
        }
        System.out.println("MIN : " +minString+ "\nMAX : " +maxString);
    }//end main
}//end class
