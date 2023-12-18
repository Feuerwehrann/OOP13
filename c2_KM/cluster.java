package c2_KM;

import java.util.ArrayList;

public class cluster {
    String name;
    int x;
    int y;
    ArrayList<DataObject>dasCluster;

    
  

    public cluster(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.dasCluster = null;
    }


    public void DatenAdd(DataObject o){
        dasCluster.add(o);
    }
    public void DatenRemove(DataObject o){
        dasCluster.remove(o);
    }
    public void DatenClear(){
        dasCluster.clear();
    }


    public ArrayList<DataObject> getDasCluster() {
        return dasCluster;
    }
    public void setDasCluster(ArrayList<DataObject> dasCluster) {
        this.dasCluster = dasCluster;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "cluster [name=" + name + ", x=" + x + ", y=" + y + "]";
    }

}
