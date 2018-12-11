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
	private HashMap<String,ActionListener> actions;
	
	public Game() {
		this.setActions();
		frame = new Frame(actions);
		
		if(Settings.getShowMainMenu()) {
			frame.showMainMenu();
		}
	}
	
	public final void setActions() {
		actions = new HashMap<String,ActionListener>();
		actions.put(Constants.KEY_START_GAME, new StartGame());
	}
}
