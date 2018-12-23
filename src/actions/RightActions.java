package actions;

import java.awt.event.KeyEvent;

import game.Settings;
import utils.Constants;

public class RightActions extends KListener {
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_RIGHT_KEYS) {
			Settings.setRight(true);
		}
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_RIGHT_KEYS) {
			Settings.setRight(false);
		}
	}
	
}
