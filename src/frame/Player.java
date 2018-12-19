package frame;

import java.awt.Color;

import javax.swing.JPanel;

import utils.Constants;

public class Player extends JPanel {
	private static final long serialVersionUID = 1L;
	private int positionX;
	private int positionY;
	
	public Player() {
		this.positionX = 0;
		this.positionY = 0;
		this.setLayout(null);
		this.setBounds(this.positionX, this.positionY, Constants.PLAYER_SIZE_X, Constants.PLAYER_SIZE_Y);
		this.setBackground(new Color(0));
	}
	
	public void moveRight() {
		this.positionX++;
		this.setBounds(this.positionX, this.positionY, Constants.PLAYER_SIZE_X, Constants.PLAYER_SIZE_Y);
	}
}
