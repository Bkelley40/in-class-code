import javax.swing.JComponent;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class VennDiagramComponent extends JComponent {
	@Override
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(10.0, 10.0, 200.0, 200.0);
		
		g2.setColor(new Color(255, 0, 0, 100));
		g2.fill(circle);
		
		Ellipse2D circle2 = new Ellipse2D.Double(100.0, 10.0, 200.0, 200.0);
		g2.setColor(new Color(0, 0, 255, 100));
		g2.fill(circle2);
		
	}
	
	@Override
	public Dimension getPreferredSize ()
	{
		return new Dimension(310, 220);
	}
}
