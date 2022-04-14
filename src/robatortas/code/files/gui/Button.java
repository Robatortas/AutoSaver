package robatortas.code.files.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

import robatortas.code.files.Program;
import robatortas.code.files.styles.ButtonStyles;

public class Button {
	
	// Panel (For displaying buttons n' stuff)
	private JPanel panel;
	
	public JButton button;
	
	public ButtonStyles buttonStyles;
	public Color bgColor = new Color(0xFFC667);
	public Color hoverColor = new Color(0xD7A757);
	public Color clickColor = new Color(0xC69949);
	
	private Program program;
	
	public Button(JPanel panel, Program program) {
		this.panel = panel;
		this.program = program;
	}
	
	// Allocated space in memory for the buttons
	public JButton newButton(String text) {
		return button = new JButton(text);
	}
	
	// Sets the default properties of the buttons
	public void setDefaultProperties() {
		
	}
	
	public void setSettings(Color bgColor, Color hoverColor, Color clickColor) {
		buttonStyles.setSettings(bgColor, hoverColor, clickColor);
	}
	
	// Adds the buttons to the panel
	public void addButton() {
		panel.add(button);
	}
	
	// Sets the button style
	public void setStyle() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		buttonStyles = new ButtonStyles(button, program);
	}
}