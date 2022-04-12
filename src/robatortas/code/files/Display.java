package robatortas.code.files;

import java.awt.Dimension;

import javax.swing.JFrame;

import robatortas.code.files.gui.GUI;

public class Display {

	public Display(int width, int height, String title, Program program) {
		
		JFrame frame = new JFrame();
		
		Dimension size = new Dimension(width, height);
		
		GUI gui = new GUI(program);
		
		frame.setTitle(title);
		frame.setSize(size);
		frame.add(gui.panel);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}