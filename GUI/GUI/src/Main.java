import javax.swing.JFrame;

public class Main {
	public static void main (String[] args)
	{
		// parts that are not graphical
		
		// sheet of paper
		JFrame window = new JFrame();
		
		window.setTitle("Venn Diagram");
		// what to draw
		// where to draw
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300, 300);
		window.setVisible(true);
	}
}
