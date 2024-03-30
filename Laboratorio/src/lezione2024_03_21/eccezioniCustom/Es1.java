package lezione2024_03_21.eccezioniCustom;

public class Es1 {
    public static void eccezionePari(int numero) throws EccezioniCustom.NonPariException {
        try {
            if (numero % 2 == 0)
                throw new EccezioniCustom.NonPariException();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws EccezioniCustom.NonPariException {
        eccezionePari(12);
    }
}//end class