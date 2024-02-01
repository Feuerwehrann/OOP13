package GUIKMeans;
import java.awt.Color;
import java.util.ArrayList;

public class Cluster {
	int x;
	int y;
	Color color;
	String name;
	ArrayList <Datapoint> DatapointList;
	
	public Cluster(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
		this.DatapointList = new ArrayList <Datapoint>();
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
	public void hinzufuegen (int x, int y) {
		DatapointList.add(new Datapoint (x,y));
	}

	

}

}
