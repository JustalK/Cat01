package actions;

import java.awt.event.KeyEvent;

import game.Settings;
import utils.Constants;

public class LeftActions extends KListener {
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_LEFT_KEYS) {
			Settings.setLeft(true);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_LEFT_KEYS) {
			Settings.setLeft(false);
		}
	}
	
}
