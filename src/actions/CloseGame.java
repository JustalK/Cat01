package actions;

import java.awt.event.KeyEvent;

import game.Settings;
import utils.Constants;

public class CloseGame extends KListener {

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_CLOSE_GAME) {
			Settings.setCloseGame(true);
		}
	}
}
