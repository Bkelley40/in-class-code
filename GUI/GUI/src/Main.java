import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

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
		
		JButton button = new JButton("GO");
		window.add(button, BorderLayout.SOUTH);
		
		window.add(new VennDiagramComponent());

		// where to draw
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setSize(300, 300);
		window.pack();
		window.setVisible(true);
	}
}
