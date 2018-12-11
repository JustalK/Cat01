package game;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import actions.StartGame;
import frame.Frame;
import utils.Constants;

public class Game {
	private Frame frame;
	private ActionListener startGame;
	
	public Game() {
		startGame = new StartGame();
		frame = new Frame(startGame);
		
		if(Settings.getShowMainMenu()) {
			frame.showMainMenu();
		}
	}
}
