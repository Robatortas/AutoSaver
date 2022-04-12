package robatortas.code.files.styles;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		onClick();
	}
	
	public void bg() {
		button.start.setBackground(bgColor);
	}
	
	// TODO: FINISH METHOD ASAP!
	public void onClick() {
		for(int i = 0; i < buttons.length; i++) {
			JButton iButtons = buttons[i];
			iButtons.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					iButtons.setBackground(new Color(0xDAA958));
					System.out.println("Clicked");
			    }
			});
		}
	}
}
