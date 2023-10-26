package b1_Listen;

import java.text.Collator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEinkaufsliste {
    public static void main(String[] args) {
        String naechsterEintrag;
        System.out.println("\33[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        LinkedList<String> einkaufsliste = new LinkedList<>();
        einkaufsliste.add("Äpfel");
        einkaufsliste.add("Hafermilch");
        einkaufsliste.add("Tomaten");
        System.out.println(einkaufsliste);
        while (true) {

            System.out.println("Soll noch etwas hinzugefügt werden?");
            if (sc.nextLine().equals("ja")) {
                System.out.print("Hinzufügen: ");
                naechsterEintrag=sc.nextLine();
                if(!(einkaufsliste.contains(naechsterEintrag))){
                    einkaufsliste.add(naechsterEintrag);
                    einkaufsliste.sort((o1, o2)-> Collator.getInstance().compare(o1, o2));
                    System.out.println(einkaufsliste);
                   

                }
                else{
                    System.out.println("Dies steht schon auf ihrer Liste");
                }
                
            }
            else{
                System.out.println(einkaufsliste);
                System.out.println("Soll etwas entfernt werden?");
                if (sc.nextLine().equals("ja")) {
                    System.out.print("Entfernen: ");
                    einkaufsliste.remove(sc.nextLine());
                    einkaufsliste.sort((o1, o2)-> Collator.getInstance().compare(o1, o2));
                    System.out.println(einkaufsliste);
                }
                else{
                    einkaufsliste.sort((o1, o2)-> Collator.getInstance().compare(o1, o2));
                    System.out.println(einkaufsliste);

                    break;

                }
                break;

            }
        }
        sc.close();

    }

}