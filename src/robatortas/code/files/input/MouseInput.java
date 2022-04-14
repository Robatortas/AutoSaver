package robatortas.code.files.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInput implements MouseListener, MouseMotionListener {
	
	public int mouseX, mouseY;
	public int mousePX, mousePY;
	
	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		this.mouseX = e.getX();
		this.mouseY = e.getY();
	}

	public void mouseClicked(MouseEvent e) {
		this.mousePX = e.getX();
		this.mousePY = e.getY();
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
}