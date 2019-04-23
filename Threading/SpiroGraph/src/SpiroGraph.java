import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SpiroGraph extends JFrame implements ActionListener
{
	public static void main (String[] args)
	{
		SpiroGraph wow = new SpiroGraph();
		wow.setVisible(true);
	}
	
	public SpiroGraph ()
	{
		super("BOOM");
		
		this.setSize(400, 400);
		JButton go = new JButton("GO!");
		go.addActionListener(this);
		this.add(go, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed (ActionEvent e)
	{
		System.out.println("heyo");
	}

}
