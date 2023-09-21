# Threads erzeugen mit Interface

## Problem bei dem Erben von Thread
Bei der bisherigen Erstellung eines Threads mit Vererbung ist der Nachteil, dass nicht von anderen Klassen geerbt werden kann.

## Vorteil bei dem Erben von Thread
Verwaltungsmethoden für Threads sind bei dem erben automatisch verfügbar.

## Übung wie in Ordner 1
1. Erstelle die Klassen `ErzeugeThread.java` und `MeinThread.java`.
2. Erstelle Threads mithilfe des Interfaces `Runnable`
    ````java
    public class MeinThread2 implements Runnable{

    public static final String MeinThread2 = null;
    String name;
    int wartezeit;
    Thread t;

    public MeinThread2(String name, int wartezeit){
        this.name = name;
        this.wartezeit = wartezeit;
        this.t = new Thread(this);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }

        try {
            Thread.sleep(wartezeit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void start(){
        t.start();
    }
    }
    ````