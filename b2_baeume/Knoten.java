package b2_baeume;

public class Knoten {

    public Knoten(int wert) {
        links = null;
        rechts = null;
        this.wert = wert;


    }

    public int wert;
    public Knoten links;
    public Knoten rechts;

}

