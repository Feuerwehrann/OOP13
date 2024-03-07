package Client;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements KeyListener {
	private String adress;
	private int port;
	
	private Socket connectionToServer;
	private BufferedReader fromServerReader;
	private PrintWriter toServerWriter;
	
	private JTextArea outputTextArea;
	private JTextField inputTextField;
	private JScrollPane outputScrollPane;
	
	public ChatClient (int port) {
		super("Chat");
		this.port = port;
		adress = JOptionPane.showInputDialog("IP-Adress");
		
		if (adress != null) {
			receiveMessages();
		}
	}
	
	private void initGUI() {
		outputTextArea = new JTextArea();
		outputTextArea.setEditable(false);
		outputTextArea.setBorder(BorderFactory.createTitledBorder("Chat"));
		outputScrollPane = new JScrollPane(outputTextArea);
		inputTextField = new JTextField();
		inputTextField.setBorder(BorderFactory.createTitledBorder("Nachricht eingeben"));
		
		inputTextField.addKeyListener(this);
		
		add(outputScrollPane, BorderLayout.CENTER);
		add(inputTextField, BorderLayout.SOUTH);
		
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	
	private void receiveMessages() {
		try {
			connectionToServer = new Socket(adress, port);
			fromServerReader = new BufferedReader( new InputStreamReader(connectionToServer.getInputStream()));
			toServerWriter = new PrintWriter(new OutputStreamWriter(connectionToServer.getOutputStream()));
			initGUI();
			while(true) {
				String message = fromServerReader.readLine();
				outputTextArea.append(message+ "\n");
				outputScrollPane.getVerticalScrollBar().setValue(outputScrollPane.getVerticalScrollBar().getMaximum());
			}
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Verbindung zum Server \"" + adress + "\" fehlgeschlagen.");
			dispose();
		}
		finally {
			if (connectionToServer != null) {
				try {
					connectionToServer.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			if (toServerWriter != null) {
				toServerWriter.close();
			}
		}
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String message = inputTextField.getText();
			if (!message.isEmpty()) {
				toServerWriter.println(message);
				toServerWriter.flush();
				inputTextField.setText("");
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main (String [] args) {
		new ChatClient(3141);
	}

}
