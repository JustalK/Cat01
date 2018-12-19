package actions;

import java.awt.event.KeyEvent;

import frame.Player;
import utils.Constants;

public class RightActions extends KListener {
	Player player;
	
	public RightActions(Player player) {
		this.player = player;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_RIGHT_KEYS) {
			this.player.moveRight();
		}
	}
	
}
