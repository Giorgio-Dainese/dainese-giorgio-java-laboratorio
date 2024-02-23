package esercizi26_02_2024;

/**
 * @author giorgiodainese
 * Scrivere un metodo che controlli quale sia il più piccolo tra tre numeri;
 * 23/02/2024
 */

public class MinoreTraTreNumeri {
    public static int MinoreTraTreNumeri(int num1, int num2, int num3){
        //int minore;
        if (num1 < num2 && num1 < num3){
            return  num1;
        }else if(num2 < num1 && num2<num3){
            return num2;
        } else return num3;
    }
    public static void main(String[] args) {
        System.out.println(MinoreTraTreNumeri(1, 1, 3));
    }//end main
}//end class
