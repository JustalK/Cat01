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
		
		if(Settings.getShowMenu()) {
			//frame.showMenu();
			getInformations();
		}
	}
	
	public void getInformations() {
		try {
			Scanner scanner = new Scanner(new File(Constants.DIRECTORY_LEVELS+"/levels_0_0.lj"));
			HashMap<String,String> informations = new HashMap<String,String>();
			
			for(int i=0;i<5;i++) {
				informations.put(scanner.nextLine(), scanner.nextLine());
			}
			System.out.println(informations);
			/**
			while (scanner.hasNextLine()) {
				System.out.println("--");
			}
			**/
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
