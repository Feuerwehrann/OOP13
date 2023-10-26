package b1_Array;

public class Array {
    public static void main(String[] args) {
        String namen [] = {"Jakob", "Michael", "Helene"};
        for (int i = 0; i<namen.length; i++){
            System.out.println(namen[i]);
        }
        namen[0]=null;
        for (int i = 0; i<namen.length; i++){
            System.out.println(namen[i]);
        }
        
        for (String strNamen : namen) {
            if (strNamen == null){
                System.out.println("Es gibt leere Stellen!");

            }    
        }
    }   
}
