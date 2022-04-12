package robatortas.code.files;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GUI {
	
	public JPanel panel;
	
	public GUI(Program program) {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, program.width, program.height);
		buttons();
	}
	
	public void buttons() {
		JButton button = new JButton("Howdy!");
		
		button.setBounds(10, 10, 100, 50);
		panel.add(button);
	}
}
