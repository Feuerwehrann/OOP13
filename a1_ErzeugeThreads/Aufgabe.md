# Thread erzeugen

## Aufgabe
1. Erzeugen Sie die Java Dateien `ErzeugeThreads.java` und `MyThread.java`
2. Fügen Sie eine main-Methode in die Klasse `ErzeugeThreads.java`
    ````java
    public class ErzeugeThreads {
        public static void main(String[] args) {
        }
    }
    ````
3. Die Klasse `MyThread.java` soll von der Klasse `Thread` erben
    ````java
    public class MyThread extends Thread {...}
    ````
5. Beim erzuegen des Threads soll der Name und die Wartezeit festgelegt sein -> Konstruktor mit Übergabeparameter
    ````java
    public class MyThread extends Thread {
   //...
        public MyThread (String name, int pWait){
            this.name=name;
            wait=pWait;
    }
    }
    ````
5. Jeder Thread hat einen Namen und eine Wartezeit in ms und zählt von 1-100 und gibt diese Werte nachdem er gestartet wurde Nebenläufig auf der Konsooel auf der Konsole aus. Erweitern sie die Thread Klasse und testen sie zwei Threads mit 30 und 100 ms Wartezeit
    ````java
    public class MyThread extends Thread {
    String name;
    int wait;

    public MyThread (String name, int pWait){
        this.name=name;
        wait=pWait;
    }
    @Override
    public void run() {
        super.run();
        for (int i = 0; i<100; i++){
            System.out.println(name+ ": "+i);
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   
    
    }
    ````
6. Zeigen sie, dass der MainThread vor den Zähl Threads zuende ist, obwohl diese zuerst gestartet werden
    ````java
    public class ErzeugeThreads {

    public static void main(String[] args) {
        System.out.println("Erzeuge Thread gestartet");
        MyThread a = new MyThread("a",30);
        MyThread x = new MyThread("x", 100);

        a.start();
        x.start();

        System.out.println("Main beendet");


        }
    }
    ````