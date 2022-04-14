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
	
	// Buttons
	public JButton[] buttons = new JButton[2];
	public JButton start, stop;
	
	private Color bgColor = new Color(0xFFC667);
	private Color hoverColor = new Color(0xD7A757);
	private Color clickColor = new Color(0xC69949);
	
	private Program program;
	
	public Button(JPanel panel, Program program) {
		this.panel = panel;
		this.program = program;
		
		newButtons();
		assignButtonIndex();
		setButtonProperties();
		addButtons();
		
		setStyle();
		
	}
	
	// Allocated space in memory for the buttons
	public void newButtons() {
		start = new JButton("Start");
		stop = new JButton("Stop");
	}
	
	// Assigns an index to each button
	public void assignButtonIndex() {
		buttons[0] = start;
		buttons[1] = stop;
	}
	
	// Sets the properties of the buttons
	public void setButtonProperties() {
		buttons[0].setBounds(10, 10, 100, 50);
		buttons[0].setFocusable(false);
	}
	
	// Adds the buttons to the panel
	public void addButtons() {
		panel.add(buttons[0]);
	}
	
	// Sets the button style
	public void setStyle() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new ButtonStyles(this, program);
	}
}