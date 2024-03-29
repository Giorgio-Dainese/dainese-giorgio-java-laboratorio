package lezione2024_03_21.eccezioniCustom;

public class EccezioniCustom {
    public static class NonPariException extends Exception{
        public NonPariException (){
            super("Attenzione, il numero è pari");
        }
    }
    public static void eccezionePari(int numero) throws NonPariException {
        try {
            if (numero % 2 == 0)
                throw new NonPariException();

        } catch (NonPariException e){
            System.out.println(e.getMessage());
        }

    }
}

