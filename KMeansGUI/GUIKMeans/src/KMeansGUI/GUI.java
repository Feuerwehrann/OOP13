package KMeansGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDataPanel DataPanel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("KMeans");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		 DataPanel = new JDataPanel();
		contentPane.add(DataPanel, BorderLayout.CENTER);
		DataPanel.addMouseListener(this);
		
		JPanel ButtonPanel = new JPanel();
		contentPane.add(ButtonPanel, BorderLayout.SOUTH);
		
		
		
		JButton btDelete = new JButton("delete");
		btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("delete");
			}
		});
		
		JToggleButton btAdd = new JToggleButton("Add");
		ButtonPanel.add(btAdd);
		ButtonPanel.add(btDelete);
		
	
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("add");
			}
		});
		
		JRadioButton btCluster = new JRadioButton("Cluster");
		btCluster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("datapoibnt");
			}
		});
		buttonGroup.add(btCluster);
		ButtonPanel.add(btCluster);
		
		JRadioButton btDatapoint = new JRadioButton("Datapoint");
		btDatapoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("datapoint");
			}
		});
		buttonGroup.add(btDatapoint);
		ButtonPanel.add(btDatapoint);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click");
		DataPanel.addDataPoint(e.getX(), e.getY());
		revalidate();
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
