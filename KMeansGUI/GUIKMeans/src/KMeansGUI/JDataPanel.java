package KMeansGUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JDataPanel extends JPanel {
	public JDataPanel() {
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, 50, 100);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(100, 100, 10, 10);
	}
	public void addDataPoint(int x, int y) {
		
	}

	
}
