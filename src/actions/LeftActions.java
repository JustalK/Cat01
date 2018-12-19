package actions;

import java.awt.event.KeyEvent;

import game.Settings;
import utils.Constants;

public class LeftActions extends KListener {
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_LEFT_KEYS) {
			System.out.println("left");
			Settings.setCloseGame(true);
		}
	}
	
}
