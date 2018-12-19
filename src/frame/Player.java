package frame;

import java.awt.Color;

import javax.swing.JPanel;

import utils.Constants;

public class Player extends JPanel {
	private static final long serialVersionUID = 1L;

	public Player() {
		this.setLayout(null);
		this.setBounds(0, 0, Constants.PLAYER_SIZE_X, Constants.PLAYER_SIZE_Y);
		this.setBackground(new Color(0));
	}
}
