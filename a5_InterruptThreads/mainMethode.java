package a5_InterruptThreads;

public class mainMethode {

    public static void main(String[] args) {
        System.out.println("Erzeuge Thread gestartet");
        MyThread a = new MyThread();

        a.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
          a.interrupt();
            e.printStackTrace();
            
        }


        System.out.println("Main beendet");

    }
}