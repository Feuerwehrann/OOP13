# Ampel mit Threads
## Zustände

### Definition
Die Nummerierung wird als Zustandsvariable umgesetzt (Konstante). Der Wechsel der Zustände wird über ein Switch-While Idiom gelöst. Jede Ampel läuft in einem nebenläufigen Thread. 

1. Rot
2. Rot-Gelb
3. Grün
4. Gelb

## Benötigte Klassen
- ausführbare Klasse `StarteAmpel.java`
- Klasse `Ampel.java`

## Was soll eine Ampel  tun?
- nach starten einer Ampel ist der Zustand rot
- wait definiert die Wartezeit der Zustände

## Testszenario
- Es werden zwei Ampeln gestartet
- Es erfolgt die Ausgabe des Namens der Ampel mit zugehörigem Zustand
- Eine gestartete Ampel läuft endlos weiter

## Lösung
In der Klasse Ampel erstelle ich den Konstruktor für das Interface. Außerdem wird die run() und die start() Methode benötigt. Zusätzlich erstelle ich die Methode wait() um den Code übersichtlicher zu machen. Den Thread habe ich über das Interface Runnable erstellt.
### run() Methode
````Java
    // Nebenläufiger Zustandswechsel der Ampel
    @Override
    public void run (){
         while (true) {
            switch (aktZustand) {
                case ROT:
                System.out.println(name + ": ROT");
                    warten(wait);
                aktZustand = ROTGELB;
                    break;
            
                case ROTGELB:
                System.out.println(name + ": ROTGELB");
                warten(wait); 
                aktZustand = GRUEN;
                    break;
                
                case GRUEN:
                System.out.println(name + ": GRÜN");
                warten(wait);
                aktZustand = GELB;

                    break;
                
                case GELB:
                System.out.println(name + ": GELB");
                warten(wait);
               
                aktZustand = ROT;

                    break;
            }
            
         }
    }

    
````

### warten() Methode
````Java
    private void warten(int warten) {
        try {
                        Thread.sleep(warten);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

    }
````

### Start Klasse
In der Start Klasse erstelle ich zwei Ampeln und starte diese über die start() Methode
````Java
    public class StartAmpel {
    public static void main(String[] args) {
        System.out.println("Ampeln gestartet");
        Ampel ampel1 = new Ampel("Ampel 1", 300);
        Ampel ampel2 = new Ampel("Ampel 2", 500);

        ampel1.start();
        ampel2.start();

    }

}
````
