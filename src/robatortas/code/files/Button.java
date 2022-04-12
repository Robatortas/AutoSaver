package robatortas.code.files;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Button {
	
	// Panel (For displaying buttons n' stuff)
	public JPanel panel;
	
	// Buttons
	public JButton[] buttons = new JButton[2];
	public JButton start, stop;
	
	public Button(JPanel panel) {
		this.panel = panel;
		
		newButtons();
		assignButtonIndex();
		setButtonProperties();
		addButtons();
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
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		buttons[0].setBounds(10, 10, 100, 50);
		buttons[0].setFocusable(false);
	}
	
	// Adds the buttons to the panel
	public void addButtons() {
		panel.add(buttons[0]);
	}
}
