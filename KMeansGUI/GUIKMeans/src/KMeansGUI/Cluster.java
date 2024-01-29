package KMeansGUI;

import java.awt.Color;
import java.util.ArrayList;

public class Cluster {
	int x;
	int y;
	Color color;
	String name;
	ArrayList <Datapoint> clusterList = new ArrayList <Datapoint> ();
	
	public Cluster(int x, int y, Color color, ArrayList<Datapoint> clusterList) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
		this.clusterList = clusterList;
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void add (int x, int y) {
		clusterList.add(new Datapoint (x,y));
	}
	public static void add(Datapoint d) {
		Datapoint d1 = new Datapoint(d.getX(), d.getY());
		
	}
	

}
