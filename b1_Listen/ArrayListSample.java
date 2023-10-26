package b1_Listen;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        // ArrayList erstellen
        ArrayList<String> namen = new ArrayList<>();
        // Namen hinzufügen
        namen.add("Helene");
        namen.add("Michael");
        namen.add("Niklas");
        // Ausgabe
        System.out.println(namen);
        // Entfernne
        namen.remove(1);
        // Iterieren
        for (String strNamen : namen) {
            System.out.println(strNamen);
        }
        // Wert getten
        String name = namen.get(0);
        System.out.println(name);

        //prüfen ob Wert in ArrayList steht
        System.out.println(namen.contains("Helene"));
    }
}
