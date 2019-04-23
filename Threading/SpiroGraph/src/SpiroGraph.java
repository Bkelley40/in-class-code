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
	
	@Override
	public void actionPerformed (ActionEvent e)
	{
		this.fill();
	}
	
	public void fill ()
	{
		Graphics2D g2 = (Graphics2D)this.getGraphics();
		g2.setColor(new Color(255, 0 ,0));
		
		g2.drawOval(50,  180, 300,  40);
	}

}
