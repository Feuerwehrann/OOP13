package b2_baeume;

public class Baum {
    Knoten wurzel = null;

    public Baum() {
        wurzel = null;
    }

    public void insert(int wert) {
        if (wurzel == null) {
            wurzel = new Knoten(wert);
        } else {
            insert(wurzel, wert);
        }

    }

    private void insert(Knoten parent, int wert) {
        if (parent.wert >= wert) {
            if (parent.links == null) {
                parent.links = new Knoten(wert);
            } else {
                insert(parent.links, wert);
            }
        } else {
            if (parent.rechts == null) {
                parent.rechts = new Knoten(wert);
            } else {
                insert(parent.rechts, wert);
            }
        }

    }

    public int hoehe(){
        int l = 0;
        int r = 0;
        if (wurzel.links != null){
            l = hoehe(wurzel.links) + 1;
        }
        if (wurzel.rechts != null){
            r = hoehe(wurzel.links) +1;
        }
        return Math.max(l, r)+1;
        
    }
    public int hoehe (Knoten parent){
        int l = 0;
        int r = 0;
        if (parent.links != null){
            l = hoehe(parent.links)+1;
        }
        if (parent.rechts != null){
            r = hoehe(parent.links)+1;
        }
        return Math.max(l, r);
    }

    public int anzahl() {
        if (wurzel == null) {
            return 0;
        } else {
            return 1 + anzahl(wurzel.links) + anzahl(wurzel.rechts);

        }

    }

    private int anzahl(Knoten parent) {
        if (parent == null) {
            return 0;
        } else {
            return 1 + anzahl(parent.links) + anzahl(parent.rechts);

        }
    }

}
