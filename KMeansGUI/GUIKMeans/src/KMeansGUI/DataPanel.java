package GUIKMeans;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class JDataPanel extends JPanel {
	
	ArrayList <Cluster> dieCluster = new ArrayList <Cluster>();
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		for (Cluster c :dieCluster ) {
			g.setColor(c.getColor());
			g.fillRect(c.getX(), c.getY(), 10, 10);
			for (Datapoint d : c.DatapointList) {
			      g.fillOval(d.getX(), d.getY(), 10, 10);
			}

		      
		    }
	}

	public void addDataPoint(int x, int y, Color darkGray) {
		System.out.println("X: "+x+" y: "+y+" added");
		if (dieCluster.isEmpty()) {
			dieCluster.add(new Cluster(100, 100, darkGray));
			
		}
		
		dieCluster.get(0).hinzufuegen(x, y);
	
		repaint();
		
	}

	public void addCluster(int x, int y, Color co) {
		System.out.println("X: "+x+" y: "+y+" added, Cluster");
		dieCluster.add(new Cluster(x,y,co));
		repaint();
		
	}


}
