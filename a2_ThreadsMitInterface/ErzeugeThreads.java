/**
 * ErzeugeThreads
 */
public class ErzeugeThreads {

    public static void main(String[] args) {
        System.out.println("Erzeuge Thread gestartet");
        MyThread a = new MyThread("a", 30);
        MyThread x = new MyThread("x", 100);

        a.start();
        x.start();

        System.out.println("Main beendet");

    }
}