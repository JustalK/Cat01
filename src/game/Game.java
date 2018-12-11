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
		
		/**
		if(Settings.getShowMainMenu()) {
			frame.showMainMenu();
		}
		**/
		loop();
	}
	
	public final void setActions() {
		actions = new HashMap<String,ActionListener>();
		actions.put(Constants.KEY_START_GAME, new StartGame());
	}
	
	public void loop() {
		double FPS = 60;
		double UPS = 160;
		long initialTime = System.nanoTime();
		final double timeU = 1000000000 / UPS;
		final double timeF = 1000000000 / FPS;
		double deltaU = 0, deltaF = 0;
		int frames = 0, ticks = 0;
		long timer = System.currentTimeMillis();
		boolean running = true;
		boolean RENDER_TIME = true;
		
	    while (running) {

	        long currentTime = System.nanoTime();
	        deltaU += (currentTime - initialTime) / timeU;
	        deltaF += (currentTime - initialTime) / timeF;
	        initialTime = currentTime;

	        if (deltaU >= 1) {
	            //getInput();
	            //update();
	            ticks++;
	            deltaU--;
	        }

	        if (deltaF >= 1) {
	            //render();
	            frames++;
	            deltaF--;
	        }

	        if (System.currentTimeMillis() - timer > 1000) {
	            if (RENDER_TIME) {
	                System.out.println(String.format("UPS: %s, FPS: %s", ticks, frames));
	            }
	            frames = 0;
	            ticks = 0;
	            timer += 1000;
	        }
	    }
	}
}
