package b2_baeume;

import java.util.ArrayList;

public class Baum {
    Knoten wurzel = null;
    public Baum () {
        wurzel=null;
    }
    public void insert (int wert){
        if (wurzel == null){
            wurzel = new Knoten(wert);
        }
        else {
            insert (wurzel, wert);
        }
        
    }
    private void insert (Knoten parent, int wert){
        if (parent.wert>= wert){
            if (parent.links == null){
                parent.links = new Knoten(wert);
            }
            else {
                insert(parent.links, wert);
            }
        }
        else{
            if (parent.rechts == null){
                parent.rechts = new Knoten(wert);
            }
            else {
                insert(parent.rechts, wert);
            }
        }
        
    }
    
    
}
