package lezione2024_03_21.eccezioniCustom;

public class EccezioniCustom {
    public static class NonPariException extends Exception{
        public NonPariException (){
            super("Attenzione, il numero è pari");
        }
    }

}

