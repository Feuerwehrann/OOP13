package b6_Lernprogramm;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hauptteil {

    public static void main(String[] args) {
        String beleidigung [] = {"Du Opfer!", "Du kannst gar nichts!", "Gewitterziege", "Lackaffe", "Holzkopf!", "Schafshirn!", "Hochgeschissner!"}; 
        String lob [] = {"Du machst das super!", "Du hast das ganz toll gemacht!", "Ich bin stolz auf dich!"};
        String frageAktuell = null;
        String antwortAktuell = null;
         String antwort= null;
         Scanner sc = new Scanner(System.in); 
         Map<String, String> ungelernt = new HashMap<String, String>();
        ungelernt.put("Welche Farbe hat ein Elefant", "Grau");
        ungelernt.put("Wann schneit es?", "Winter");
        ungelernt.put("Wo gibt es die Besten Snacks?", "dm");
        for(int i = 0; i<=4; i++){

        
        for (String key: ungelernt.keySet()) {
            System.out.println("\33[H\033[2J");
            System.out.flush();
            System.out.println(key);
            frageAktuell=key;
            antwortAktuell= ungelernt.get(frageAktuell);
            break;
         }
        antwort = sc.nextLine();
        if (antwort.equals(ungelernt.get(frageAktuell))) 
        {

            System.out.println(lob[(int)(Math.random() * (4))]);
            
        }
        else{
            System.out.println(beleidigung[(int)(Math.random() * (8))]);
            System.out.println("Richtige Antwort: "+ungelernt.get(frageAktuell));
        }
        ungelernt.remove(frageAktuell);
        ungelernt.put(frageAktuell, antwortAktuell);
        sc.close();
        

    }
}
}