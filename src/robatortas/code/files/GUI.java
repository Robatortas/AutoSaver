package robatortas.code.files;

import javax.swing.JPanel;

public class GUI {
	
	public JPanel panel;
	
	private Program program;
	
	private Button button;
	
	public GUI(Program program) {
		this.program = program;
		
		setPanel();
		setButton();
	}
	
	public void setPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, program.width, program.height);
	}
	
	public void setButton() {
		button = new Button(panel);
	}
}