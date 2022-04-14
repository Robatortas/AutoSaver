package robatortas.code.files.styles;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import robatortas.code.files.Program;
import robatortas.code.files.gui.Button;

// Going to try and make it as CSS'ish as possible
public class ButtonStyles {
	
	private Button button;
	
	private JButton[] buttons;
	
	private Color bgColor;
	private Color hoverColor;
	private Color clickColor;
	
	private Program program;
	
	public ButtonStyles(Button button, Program program) {
		this.button = button;
		this.buttons = button.buttons;
		this.program = program;
	}
	
	public void setSettings(Color bgColor, Color hoverColor, Color clickColor) {
		this.bgColor = bgColor;
		this.hoverColor = hoverColor;
		this.clickColor = clickColor;
	}
	
	public void setStyles() {
		general();
		bg();
		onClick();
		onHover();
	}
	
	// Contains general styles for all buttons
	public void general() {
		allButtons().setFocusable(false);
		allButtons().setBorder(null);
	}
	
	public void bg() {
		button.start.setBackground(bgColor);
	}
	
	public void onHover() {
		allButtons().addMouseListener(new MouseListener() {
			// FILLERS
			public void mouseClicked(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
			
			// USED
			public void mouseEntered(MouseEvent e) {
				allButtons().setBackground(hoverColor);
			}
			public void mouseExited(MouseEvent e) {
				allButtons().setBackground(bgColor);
			}
		});
	}
	
	public void onClick() {
		allButtons().addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mousePressed(MouseEvent e) {
				allButtons().setBackground(clickColor);
			}
			public void mouseReleased(MouseEvent e) {
				allButtons().setBackground(hoverColor);
			}
			
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
		});
	}

	@SuppressWarnings("unused")
	public JButton allButtons() {
		for(int i = 0; i < buttons.length; i++) {
			JButton button = buttons[i];
			return button;
		}
		return null;
	}
}