package actions;

import java.awt.event.KeyEvent;

import frame.Player;
import utils.Constants;

public class LeftActions extends KListener {
	Player player;
	
	public LeftActions(Player player) {
		this.player = player;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == Constants.KE_LEFT_KEYS) {
			System.out.println("left");
			this.player.moveRight();
		}
	}
	
}
