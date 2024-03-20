package lezione2024_03_13.Es1DispensaAstrazionePag8;

/**
 * Implementare la classe Poligono in modo astratto e le sue specializzazioni
 *
 * @author Giorgio Dainese
 * 13/03/2024
 */
public class Main extends Poligono {
    public Main(int numeroLati, double lato) {
        super(numeroLati, lato);
    }

    @Override
    public Double calcolaPerimetro() {
        return null;
    }

    @Override
    public Double calcolaArea() {
        return null;
    }

    public static void main(String[] args) {
        Poligono p1 = new Poligono() {
            @Override
            public Double calcolaPerimetro() {
                return this.getLato()*4;
            }

            @Override
            public Double calcolaArea() {
                return Math.pow(this.getLato(), 2);
            }
        };

        p1.setLato(5.0);
        System.out.println(p1.calcolaPerimetro());
        System.out.println(p1.calcolaArea());
    }



}//end Main class
