import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame  {
	public static void main (String[] args)
	{
		Main window = new Main();
		window.setVisible(true);
	}
	
	public Main ()
	{
		super();
		// parts that are not graphical
		
		// sheet of paper
		
		this.setTitle("Venn Diagram");
		// what to draw
		JTextField textField = new JTextField("Two disks");
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setEditable(false);
		this.add(textField, BorderLayout.NORTH);
		
		VennDiagramComponent venn = new VennDiagramComponent();
		this.add(venn);

		// SpinnerNumberModel wheel = new SpinnerNumberModel(100, 10, 210, 10);
		//window.add(new JSpinner(wheel), BorderLayout.SOUTH);
		//wheel.addChangeListener(venn);
		JSlider slider = new JSlider(10, 210, 100);
		slider.addChangeListener(venn);
		slider.addChangeListener(new SliderListener());
		this.add(slider, BorderLayout.SOUTH);
		
		// where to draw
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setSize(300, 300);
		this.pack();
		
	}
	
	public class SliderListener implements ChangeListener
	{
		@Override
		public void stateChanged(ChangeEvent event)
		{
			Main.this.revalidate();
			Main.this.pack();
		}
	}
//	public class ButtonListener implements ActionListener
//	{
//		public void actionPerformed (ActionEvent e)
//		{
//			JOptionPane.showMessageDialog(null, "Go clicked");
//		}
//	}
}
