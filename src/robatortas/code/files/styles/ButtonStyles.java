package robatortas.code.files.styles;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import robatortas.code.files.Program;
import robatortas.code.files.gui.Button;

// Going to try and make it as CSS'ish as possible
public class ButtonStyles {
	private JButton button;
	
	private Color bgColor;
	private Color hoverColor;
	private Color clickColor;
	
	private Program program;
	
	public ButtonStyles(JButton button, Program program) {
		this.button = button;
		this.program = program;
		
		setStyles();
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
		button.setFocusable(false);
		button.setBorder(null);
	}
	
	public void bg() {
		button.setBackground(bgColor);
	}
	
	public void onHover() {
		button.addMouseListener(new MouseListener() {
			// FILLERS
			public void mouseClicked(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
			
			// USED
			public void mouseEntered(MouseEvent e) {
				button.setBackground(hoverColor);
				System.out.println("IN!");
			}
			public void mouseExited(MouseEvent e) {
				button.setBackground(bgColor);
			}
		});
	}
	
	public void onClick() {
		button.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mousePressed(MouseEvent e) {
				button.setBackground(clickColor);
			}
			public void mouseReleased(MouseEvent e) {
				button.setBackground(hoverColor);
			}
			
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
		});
	}
}