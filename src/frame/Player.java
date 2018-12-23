package frame;

import java.awt.Color;

import javax.swing.JPanel;

import utils.Constants;

public class Player extends JPanel {
	private static final long serialVersionUID = 1L;
	private int positionX;
	private int positionY;
	private double nextPositionX;
	private double nextPositionY;
	private double velocity;
	private double nextVelocity;
	
	public Player() {
		this.positionX = 0;
		this.positionY = 0;
		this.nextPositionX = this.positionX;
		this.nextPositionY = this.positionY;
		this.velocity = 1;
		this.nextVelocity = 1;
		this.setLayout(null);
		this.setBounds(this.positionX, this.positionY, Constants.PLAYER_SIZE_X, Constants.PLAYER_SIZE_Y);
		this.setBackground(new Color(0));
	}
	
	public void noMove() {
		this.velocity=1;
	}
	
	public void moveLeft() {
		this.nextPositionX=this.positionX-this.velocity;
		//this.velocity++;
	}
	
	public void moveRight() {
		this.nextPositionX=this.positionX+this.velocity;
		//this.velocity++;
	}
	
	public void render() {
		System.out.println(this.positionX-this.nextPositionX);
		if(this.positionX!=this.nextPositionX) {
			this.velocity = this.velocity < 10 ? this.velocity+0.1 : this.velocity;
		}
		this.positionX = (int) this.nextPositionX;
		this.positionY = (int) this.nextPositionY;
		this.setBounds(this.positionX, this.positionY, Constants.PLAYER_SIZE_X, Constants.PLAYER_SIZE_Y);	
	}
}
