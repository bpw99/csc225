
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;

public class DamianMain
{
	JFrame contentPane;
	JLabel counterLbl, perSecondLbl;
	int majorNumber,timerSpeed, DamianCounter, majorPrice, dameNumber, damePrice, megaNumber, megaPrice;
	double perSec;
	boolean timerOn;
	JButton button1, button2, button3, button4, button5, button6, button7, button8;
	DamianHandler Dhandler = new DamianHandler();
	Timer timer;
	JTextArea descriptionText;
	MouseSettings settings = new MouseSettings();
	
	
	
	public static void main(String[] args)
	{
		
		new DamianMain();


	
		
	}
	
	public DamianMain()
	{
		timerOn = false;
		perSec = 0;
		DamianCounter = 9000;
		majorNumber = 0;
		majorPrice = 20;
		dameNumber = 0;
		damePrice = 75;
		megaNumber = 0;
		megaPrice= 150;
	
		
		GUI();
	
		
	}
	
	
	
	
	
	public void GUI()  
		{
		JFrame window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.getContentPane().setLayout(null);
		
		JPanel DamianPanel = new JPanel();
		DamianPanel.setBounds(100, 200, 200, 200);
		DamianPanel.setBackground(Color.black);
		window.getContentPane().add(DamianPanel);
		

		

		
		ImageIcon Damian = new ImageIcon(getClass().getClassLoader().getResource("Damian.png"));
		
		JButton DamianButton = new JButton();
		DamianButton.setBackground(Color.black);
		DamianButton.setFocusPainted(false);
		DamianButton.setBorder(null);
		DamianButton.setIcon(Damian);
		DamianButton.addActionListener(Dhandler);
		DamianButton.setActionCommand("Damian");
		DamianPanel.add(DamianButton);
		
		JPanel counter = new JPanel();
		counter.setBounds(100, 100, 200, 100);
		counter.setBackground(Color.black);
		counter.setLayout(new GridLayout(2, 1));
		window.getContentPane().add(counter);
		
		
		counterLbl = new JLabel(DamianCounter + " Damians");
		counterLbl.setForeground(Color.white);
		counterLbl.setFont(FontChanger.font1);
		counter.add(counterLbl);
		
		perSecondLbl = new JLabel();
		perSecondLbl.setForeground(Color.white);
		perSecondLbl.setFont(FontChanger.font2);
		counter.add(perSecondLbl);
		
		JPanel itemPanel = new JPanel();
		itemPanel.setBounds(400, 150, 300, 350);
		itemPanel.setBackground(Color.black);
		itemPanel.setLayout(new GridLayout(8,1));
		window.getContentPane().add(itemPanel);
		
		
		button1 = new JButton("Major-Mouse");
		button1.setFont(FontChanger.font1);
		button1.setFocusPainted(false);
		button1.addActionListener(Dhandler);
		button1.setActionCommand("Cursor");
		button1.addMouseListener(settings);
		button1.setBackground(Color.red);
		button1.setForeground(Color.black);
		itemPanel.add(button1);
		
		button2 = new JButton("Dame-Dolla");
		button2.setFont(FontChanger.font1);
		button2.setFocusPainted(false);
		button2.addActionListener(Dhandler);
		button2.setActionCommand("Dame");
		button2.addMouseListener(settings);
		button2.setBackground(Color.pink);
		button2.setForeground(Color.black);
		itemPanel.add(button2);
		
		button3 = new JButton("Mega Clickage");
		button3.setFont(FontChanger.font1);
		button3.setFocusPainted(false);
		button3.addActionListener(Dhandler);
		button3.setActionCommand("mega");
		button3.addMouseListener(settings);
		button3.setBackground(Color.orange);
		button3.setForeground(Color.black);

		itemPanel.add(button3);
		
		button4 = new JButton("?");
		button4.setFont(FontChanger.font1);
		button4.setFocusPainted(false);
		button4.addActionListener(Dhandler);
		button4.setActionCommand("");
		button4.addMouseListener(settings);
		button4.setBackground(Color.yellow);
		button4.setForeground(Color.black);
		itemPanel.add(button4);
		
		button5 = new JButton("?");
		button5.setFont(FontChanger.font1);
		button5.setFocusPainted(false);
		button5.addActionListener(Dhandler);
		button5.setActionCommand("");
		button5.addMouseListener(settings);
		button5.setBackground(Color.green);
		button5.setForeground(Color.black);

		itemPanel.add(button5);
		
		button6 = new JButton("?");
		button6.setFont(FontChanger.font1);
		button6.setFocusPainted(false);
		button6.addActionListener(Dhandler);
		button6.setActionCommand("");
		button6.addMouseListener(settings);
		button6.setBackground(Color.cyan);
		button6.setForeground(Color.black);

		itemPanel.add(button6);
		
		button7 = new JButton("?");
		button7.setFont(FontChanger.font1);
		button7.setFocusPainted(false);
		button7.addActionListener(Dhandler);
		button7.setActionCommand("");
		button7.addMouseListener(settings);
		button7.setBackground(Color.blue);
		button7.setForeground(Color.black);

		itemPanel.add(button7);
		
		button8 = new JButton("?");
		button8.setFont(FontChanger.font1);
		button8.setFocusPainted(false);
		button8.addActionListener(Dhandler);
		button8.setActionCommand("");
		button8.addMouseListener(settings);
		button8.setBackground(Color.magenta);
		button8.setForeground(Color.black);

		itemPanel.add(button8);
		
		
		JPanel description = new JPanel();
		description.setBounds(500, 70, 250, 150);
		description.setBackground(Color.black);
		window.getContentPane().add(description);
		
		descriptionText = new JTextArea();
		descriptionText.setBounds(500, 70, 250, 150);
		descriptionText.setForeground(Color.white);
		descriptionText.setBackground(Color.black);
		descriptionText.setFont(FontChanger.font2);
		descriptionText.setLineWrap(true);
		descriptionText.setWrapStyleWord(true);
		descriptionText.setEditable(false);
		description.add(descriptionText);
		
		JButton btnNewButton = new JButton("Directions\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
				new Directions().setVisible(true);
			
				
			}
		});
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(624, 22, 126, 48);
		window.getContentPane().add(btnNewButton);
		
		
		
		window.setVisible(true);
		
		
		
		
		}
	
	public void setTimer()
	{
		timer = new Timer(timerSpeed, new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e)
			{
				DamianCounter++;
				counterLbl.setText(DamianCounter + " Damians");
				
				
				
				
			}
		});
		
		
	}
	public void timerUpdate()
	{
		if(timerOn == false)
		{
			timerOn = true;
		}
		else if(timerOn == true)
		{
			timer.stop();
		}
		
		double speed = 1/perSec * 1000;
		timerSpeed = (int)Math.round(speed);
		
		
		String str = String.format("%.1f", perSec);
		perSecondLbl.setText("Damians per second: " + str);
		
		
		setTimer();
		timer.start();
		
		
	}
	
	public class DamianHandler implements ActionListener
	{
	public void actionPerformed(ActionEvent event)
	{
		String action = event.getActionCommand();
		switch(action)
		{
		case "Damian":
			DamianCounter++;
			counterLbl.setText(DamianCounter + " Damians");
			break;
		case "Cursor":
			if(DamianCounter >= majorPrice)
			{
			DamianCounter = DamianCounter - majorPrice;
			majorPrice = majorPrice + 5 ;
			counterLbl.setText(DamianCounter + " Damians");
			majorNumber++;
			perSec = perSec + 0.1;
			button1.setText("Major-Mouse " + "(" + majorNumber + ")");
			timerUpdate();
			}
		case"Dame":
			if(DamianCounter >= damePrice)
			{
			DamianCounter = DamianCounter - damePrice;
			damePrice = damePrice + 10;
			counterLbl.setText(DamianCounter + " Damians");
			dameNumber++;
			perSec = perSec + 0.5;
			button2.setText("Dame-Dolla" +"(" + dameNumber + ")");
			timerUpdate();
				
			}
		case "mega":
			if(DamianCounter >= megaPrice)
			{
				DamianCounter = DamianCounter - megaPrice;
				megaPrice = megaPrice + 10;
				counterLbl.setText(DamianCounter + " Damians");
				megaNumber++;
				perSec = perSec + 1.0;
				button2.setText("Mega Clickage" +"(" + megaNumber + ")");
				timerUpdate();
			}
			
			
		
			
		
		
		}
		
	}

	
	

}
	public class MouseSettings implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) 
		{
			JButton button = (JButton)e.getSource();
			if(button == button1)
			{
				descriptionText.setText("Major-Mouse\n[price : " + majorPrice + "]\nAutoclicks once every ten seconds");
			}
			else if(button == button2)
			{
				descriptionText.setText("Dame-Dolla\n[price : " + damePrice + "]\nAutoclicks once every two seconds");
				
			}
			else if(button == button3)
			{
				descriptionText.setText("Mega Clickage\n[price : " + megaPrice + "]\nAutoclicks once every second");
				
			}
			
			else if(button == button4)
			{
				descriptionText.setText("This item is currently locked");

			}
			else if(button == button5)
			{
				descriptionText.setText("This item is currently locked");

			}
			else if(button == button6)
			{
				descriptionText.setText("This item is currently locked");

			}
			else if(button == button7)
			{
				descriptionText.setText("This item is currently locked");

			}
			else if(button == button8)
			{
				descriptionText.setText("This item is currently locked");

			}
			
		}

		@Override
		public void mouseExited(MouseEvent e) 
		{
			JButton button = (JButton)e.getSource();
			
			if(button == button1)
			{
				descriptionText.setText(null);
			}
			else if(button == button2)
			{
				descriptionText.setText(null);
			}
			else if(button == button3)
			{
				descriptionText.setText(null);
			}
			else if(button == button4)
			{
				descriptionText.setText(null);
			}

			else if(button == button5)
			{
				descriptionText.setText(null);
			}
			else if(button == button6)
			{
				descriptionText.setText(null);
			}
			else if(button == button7)
			{
				descriptionText.setText(null);
			}
			else if(button == button8)
			{
				descriptionText.setText(null);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
			
		}
		
		
		

	}
}





	