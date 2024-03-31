package lezione2024_03_21.eccezioniCustom;

public class EccezioniCustom {
    public static class NonPariException extends Exception{
        public NonPariException (){
            super("Attenzione, il numero è pari");
        }
    }

    public static class NumeroNegativoException extends Exception{
        public NumeroNegativoException(){super("Attenzione, c'è almeno un negativo!");}
    }

    public static class AssenzaVocaliException extends Exception{
        public AssenzaVocaliException(){super("Attenzione, non ci sono vocali!");}
    }
}//end class

