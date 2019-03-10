
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DamianMain
{
	public static void main(String[] args)
	{
		new DamianMain();
	}
	
	public DamianMain()
	{
		GUI();
	}
	
	
	public void GUI()
	{
	JFrame window = new JFrame();
	window.setSize(800,800);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.getContentPane().setBackground(Color.black);
	window.setLayout(null);
	
	JPanel DamianPanel = new JPanel();
	DamianPanel.setBounds(100, 200, 264, 191);
	DamianPanel.setBackground(Color.blue);
	window.add(DamianPanel);
	
	window.setVisible(true);
	

	
	ImageIcon Damian = new ImageIcon(getClass().getClassLoader().getResource("Damian.png"));
	
	JButton DamianButton = new JButton();
	DamianButton.setBackground(Color.black);
	DamianButton.setFocusPainted(false);
	DamianButton.setBorderPainted(false);
	DamianButton.setIcon(Damian);
	DamianPanel.add(DamianButton);
	
	
	}

}
