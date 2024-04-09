/**
 * Per il paese Italia, creare una struttura dati che associ, per ogni regione, le sue città
 * @author Giorgio Dainese
 * 06/04/2024
 */

package esercizi2024_04_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Esercizio5 {
    public static void main(String[] args) {
        ArrayList<String> piemonte = new ArrayList<>(List.of("Torinp", "Cuneo", "Asti", "Alessandria", "Biella", "Novara", "Verbania", "Vercelli"));
        ArrayList<String> veneto = new ArrayList<>(List.of("Belluno", "Padova", "Rovigo", "Treviso", "Venezia", "Verona", "Vicenza"));
        ArrayList<String> liguria = new ArrayList<>(List.of("Genova", "Imperia", "La Spezia", "Savona"));

        HashMap<String, ArrayList<String>> italia = new HashMap<>();
        italia.put("Piemonte", piemonte);
        italia.put("Veneto", veneto);
        italia.put("Liguria", liguria);

        System.out.println(italia);

    }//end main
}//end class
