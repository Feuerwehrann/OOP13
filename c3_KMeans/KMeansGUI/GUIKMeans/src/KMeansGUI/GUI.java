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

public class GUI extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDataPanel DataPanel;

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
		
		JButton btAdd = new JButton("add");
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("add");
			}
		});
		ButtonPanel.add(btAdd);
		
		JButton btDelete = new JButton("delete");
		btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("delete");
			}
		});
		ButtonPanel.add(btDelete);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		DataPanel.addDataPoint(e.getX(), e.getY(), Color.DARK_GRAY);
		
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
