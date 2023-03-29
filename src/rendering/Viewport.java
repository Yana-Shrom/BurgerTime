package src.rendering;

import javax.swing.JFrame;

public class Viewport extends JFrame{

	public Viewport(String title) {
		super(title);
		setSize(800, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}