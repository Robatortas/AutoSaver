package robatortas.code.files;

import java.awt.Canvas;

import robatortas.code.files.input.MouseInput;

public class Program extends Canvas {
	
	private static final long serialVersionUID = 1L;
	
	public int width=520, height=720/2;
	public String TITLE = "Life Auto Saver";
	
	public MouseInput mouse = new MouseInput();
	
	public Program() {
		new Display(width, height, TITLE, this);
		
		addMouseListener(mouse);
	}
	
}