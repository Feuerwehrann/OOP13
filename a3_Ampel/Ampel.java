

public class Ampel implements Runnable{

    Thread t;
    String name;
    int wait;
    int aktZustand;

    //Konstanten
    public static final int ROT = 1;
    public static final int ROTGELB = 2;
    public static final int GRUEN = 3;
    public static final int GELB = 4;

    public Ampel (String name, int wait) {
        this.wait = wait; 
        this.name = name;
        t = new Thread(this);
        aktZustand = ROT;
    }

    public void start(){
        t.start();
    }

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

    private void warten(int warten) {
        try {
                        Thread.sleep(warten);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

    }


    

    
}