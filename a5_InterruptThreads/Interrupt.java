package a5_InterruptThreads;

public class Interrupt {

    public static void main(String[] args) {
        System.out.println("Erzeuge Thread gestartet");
        MyThread a = new MyThread("a", 30);

        a.start();

        System.out.println("Main beendet");

    }
}