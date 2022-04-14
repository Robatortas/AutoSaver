package robatortas.code.files.gui;

import java.awt.Color;

import javax.swing.JPanel;

import robatortas.code.files.Program;

public class GUI {
	
	public JPanel panel;
	
	private Program program;
	
	private Button start;
	
	public GUI(Program program) {
		this.program = program;
		
		setPanel();
		setButton();
	}
	
	public void setPanel() {
		panel = new JPanel();
		setStyle();
		panel.setLayout(null);
		panel.setBounds(0, 0, program.width, program.height);
	}
	
	public void setButton() {
		start = new Button(panel, program);
		start.newButton("Start");
		start.addButton();
		start.setStyle();
		start.setDefaultProperties();
		start.setSettings(start.bgColor, start.hoverColor, start.clickColor);
		start.button.setBounds(0,0,100,100);
	}
	
	private Color bgColor = new Color(0x7E7E7E);
	public void setStyle() {
		panel.setBackground(bgColor);
	}
}