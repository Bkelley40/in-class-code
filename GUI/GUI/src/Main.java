import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Main {
	public static void main (String[] args)
	{
		// parts that are not graphical
		
		// sheet of paper
		JFrame window = new JFrame();
		
		window.setTitle("Venn Diagram");
		// what to draw
		JTextField textField = new JTextField("Two disks");
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setEditable(false);
		window.add(textField, BorderLayout.NORTH);
		
		VennDiagramComponent venn = new VennDiagramComponent();
		window.add(venn);

		SpinnerNumberModel wheel = new SpinnerNumberModel(100, 10, 210, 10);
		window.add(new JSpinner(wheel), BorderLayout.SOUTH);
		wheel.addChangeListener(venn);

		// where to draw
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setSize(300, 300);
		window.pack();
		window.setVisible(true);
	}
	
//	public class ButtonListener implements ActionListener
//	{
//		public void actionPerformed (ActionEvent e)
//		{
//			JOptionPane.showMessageDialog(null, "Go clicked");
//		}
//	}
}
