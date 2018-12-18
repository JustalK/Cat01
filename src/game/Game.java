package game;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import actions.CloseGame;
import actions.StartGame;
import frame.Frame;
import utils.Constants;

public class Game {
	private Frame frame;
	private HashMap<String,EventListener> actions;
	private HashMap<String,Image> ressources;
	
	public Game() {
		this.setActions();
		this.setRessources();
		frame = new Frame(actions,ressources);
	}
	
	public final void setActions() {
		this.actions = new HashMap<String,EventListener>();
		this.actions.put(Constants.KEY_START_GAME, new StartGame());
		this.actions.put(Constants.KEY_CLOSE_GAME, new CloseGame());
	}
	
	public final void setRessources() {
		this.ressources = new HashMap<String,Image>();
		
		try {
			InputStream is=getClass().getResourceAsStream("/assets/backgrounds/test.jpg");
			this.ressources.put("test", ImageIO.read(is));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loop() {
		double FPS = 60;
		double UPS = 60;
		long initialTime = System.nanoTime();
		final double timeU = 1000000000 / UPS;
		final double timeF = 1000000000 / FPS;
		double deltaU = 0, deltaF = 0;
		int frames = 0, ticks = 0;
		long timer = System.currentTimeMillis();
		boolean RENDER_TIME = true;
		
	    while (!Settings.getCloseGame()) {

	        long currentTime = System.nanoTime();
	        deltaU += (currentTime - initialTime) / timeU;
	        deltaF += (currentTime - initialTime) / timeF;
	        initialTime = currentTime;

	        if (deltaU >= 1) {
	            //this.input();
	            this.update();
	            ticks++;
	            deltaU--;
	        }

	        if (deltaF >= 1) {
	            this.render();
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
	    
	    // Close the frame
	    frame.dispose();
	}
	
	public void update() {
		// Show the main menu
		if(Settings.getShowMainMenu() && Settings.getStartConsole()) {
			this.frame.reset();
			this.frame.showMainMenu();
			Settings.setStartConsole(false);
		}
		// Start the game
		if(Settings.getStartGame()) {
			this.frame.reset();
		}
	}
	
	public void render() {
		this.frame.render();
	}
}
