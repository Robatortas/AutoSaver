package robatortas.code.files.styles;

import java.awt.Color;

import javax.swing.JButton;

import robatortas.code.files.gui.Button;

// Going to try and make it as CSS'ish as possible
public class ButtonStyles {
	
	private Button button;
	
	private JButton[] buttons;
	
	private Color bgColor = new Color(0xFFC667);
	
	public ButtonStyles(Button button) {
		this.button = button;
		this.buttons = button.buttons;
		
		setStyles();
	}
	
	public void setStyles() {
		bg();
	}
	
	public void bg() {
		buttons[0].setBackground(bgColor);
	}
	
	public void onClick() {
		
	}
}
