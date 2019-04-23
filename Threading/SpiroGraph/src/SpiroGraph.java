import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpiroGraph extends JFrame implements ActionListener
{
	private JPanel box;
	public static void main (String[] args)
	{
		SpiroGraph wow = new SpiroGraph();
		wow.setVisible(true);
	}
	
	public SpiroGraph ()
	{
		super("BOOM");
		
		this.box = new JPanel();
		this.add(this.box);
		
		this.setSize(400, 400);
		JButton go = new JButton("GO!");
		go.addActionListener(this);
		this.add(go, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class Stoppable extends Thread
	{
		public void run ()
		{
			Graphics2D g2 = (Graphics2D)box.getGraphics();
			g2.setColor(new Color(255, 0 ,0));
			
			for (int i = 0; i < 180 / 5; ++i)
			{
				g2.drawOval(50,  180, 300,  40);
				g2.rotate(Math.toRadians(5), 200, 200);
				try
				{
					Thread.sleep(300);
				}
				catch (InterruptedException e)
				{
				}
			}
		}
	}
	
	@Override
	public void actionPerformed (ActionEvent e)
	{
		Stoppable foo = new Stoppable();
		foo.start();
	}
	
}
