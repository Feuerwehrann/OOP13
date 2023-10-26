package b1_Array;

public class Array {
    public static void main(String[] args) {
        String namen [] = {"Jakob", "Michael", "Helene"};
        for (int i = 0; i<namen.length; i++){
            System.out.println(namen[i]);
        }
         System.out.println("---");
        namen[0]=null;
        for (int i = 0; i<namen.length; i++){
            System.out.println(namen[i]);
        }
        System.out.println("---");

        for (String strNamen : namen) {
            if (strNamen == "Helene"){
                System.out.println("Helene vorhanden");

            }    
        }
    }   
}