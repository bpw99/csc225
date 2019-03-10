import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Directions extends JFrame {

	protected JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Directions frame = new Directions();
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
	public Directions()
	{
		
		
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setBounds(100, 100, 626, 171);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
			
			JTextArea txtrClickThe = new JTextArea();
			txtrClickThe.setFont(new Font("Monospaced", Font.PLAIN, 11));
			txtrClickThe.setText("1. Click the Damian to gain points\r\n2. On your right are 8 seperate upgrade that you can buy for Damians (points)\r\n3. keep in mind that the upgrades will start to get more expensive as you progress\r\n4. Have fun and get to clicking!!!");
			contentPane.add(txtrClickThe, BorderLayout.CENTER);
			
			JTextPane txtpnDirections = new JTextPane();
			txtpnDirections.setFont(new Font("Tahoma", Font.PLAIN, 19));
			txtpnDirections.setText("Directions");
			contentPane.add(txtpnDirections, BorderLayout.NORTH);
			
		
			
		
		
			}

}
