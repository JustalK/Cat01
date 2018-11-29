package game;
import frame.Frame;

public class Game {
	private Frame frame;
	
	public Game() {
		frame = new Frame();
		
		if(Settings.getShowMenu()) {
			frame.showMenu();
		}
	}
}
