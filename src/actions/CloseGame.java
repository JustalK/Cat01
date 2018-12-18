package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Settings;

public class CloseGame implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_ESCAPE) {
			System.out.println("wqeqwe");
			Settings.setCloseGame(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
