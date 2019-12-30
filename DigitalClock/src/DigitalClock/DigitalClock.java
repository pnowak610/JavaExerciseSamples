package DigitalClock;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame  {
	JLabel jLableClock;
	
	ClockThread ct;
	
	
	public DigitalClock () {
		jLableClock = new JLabel ("");
		//LayoutManager FlowLauout;
		setLayout (new FlowLayout());
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		jLableClock.setFont(new Font("Arial",Font.CENTER_BASELINE,50));
		jLableClock.setOpaque(true);
		jLableClock.setBackground(Color.GREEN);
		add (jLableClock);
		setSize(1200,120);
		setLocationRelativeTo (null);
		ct = new ClockThread(this);
		setVisible (true);
		
		
	}
	

	public static void main(String[] args) {
		new DigitalClock();
		
	}

}
