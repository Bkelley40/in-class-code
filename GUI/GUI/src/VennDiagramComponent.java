import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class VennDiagramComponent extends JComponent implements ChangeListener
{
	private int disk2Left = 100;
	
	@Override
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(10.0, 10.0, 200.0, 200.0);
		
		g2.setColor(new Color(255, 0, 0, 100));
		g2.fill(circle);
		
		Ellipse2D circle2 = new Ellipse2D.Double((double)this.disk2Left, 10.0, 200.0, 200.0);
		g2.setColor(new Color(0, 0, 255, 100));
		g2.fill(circle2);
		
	}
	
	@Override
	public Dimension getPreferredSize ()
	{
		return new Dimension(210 + this.disk2Left, 220);
	}
	
	@Override
	public void stateChanged (ChangeEvent event)
	{
		JSlider wheel = (JSlider)event.getSource();
		this.disk2Left = (int)wheel.getValue();
		
		this.repaint();
		this.invalidate();
	}
}
