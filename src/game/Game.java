package game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import frame.Frame;
import utils.Constants;

public class Game {
	private Frame frame;
	
	public Game() {
		frame = new Frame();
		
		if(Settings.getShowMainMenu()) {
			frame.showMainMenu();
		}
	}
}
