package KMeansGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;

public class DataPanel extends JPanel{
	
	
	List<Datapoint> datenpunkte = new ArrayList<>();
	
	Graphics myGraphics;
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        myGraphics = g;
        
        for (Datapoint dataPoint : datenpunkte) {
			g.fillOval(dataPoint.x,dataPoint.y,10,10);
		}
        //g.drawLine(0, 0, 100, 100);
        addDataPoint(200,200);
}

	public void addDataPoint(int x, int y) {
		
		Cluster.add(new Datapoint(x,y));
		
	}
}
