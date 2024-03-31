package lezione2024_03_21.eccezioniCustom;

public class Es2 {
    public static void controlloNumNegativo (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] < 0) {
                    throw new EccezioniCustom.NumeroNegativoException();
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nummeri = {1,2,-3,4,5,-6};
        controlloNumNegativo(nummeri);
    }

}
