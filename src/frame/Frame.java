package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import utils.Constants;

/**
 * The running function
 * @author Justal Kevin
 */
public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private FrameInformations frameInformations;
	private JLayeredPane layersLevel;
	private JLabel background;
	private HashMap<String,EventListener> actions;
	private HashMap<String,Image> ressources;
	private Player player;
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public Frame(HashMap<String,EventListener> actions, HashMap<String,Image> ressources, Player player) {
    	this.actions = actions;
    	this.ressources = ressources;
    	this.player = player;
    	
        this.setTitle(Constants.GAME_NAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y);
        
    	this.getInformations("levels_0_0.lj");
        layersLevel = new JLayeredPane();
        this.add(layersLevel);
        this.addKeyListener((KeyListener) actions.get(Constants.KEY_CLOSE_GAME));
        this.addKeyListener((KeyListener) actions.get(Constants.KEY_MOVE_LEFT));
        
        this.revalidate();
        this.repaint();
        this.setVisible(true);
        this.setFocusable(true);
        
    }
    
    /**
     * Show the main menu
     */
    public void showMainMenu() {
		this.setBackground();
		this.setMenu();
    }
    
    public void showGame() {
    	this.getInformations("levels_0_1.lj");
    	this.setBackground();
    	this.setPlayer();
    }
    
    public void setBackground() {
		background = new JLabel(new ImageIcon(this.ressources.get(this.frameInformations.getBackground())));
		background.setLayout(null);
		background.setBounds(0, 0, Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y );
		this.layersLevel.add(background,new Integer(Constants.BACKGROUND_LEVEL));
    }
    
    public void setPlayer() {
    	this.layersLevel.add(player,new Integer(Constants.HERO_LEVEL));
    }
    
    public void setMenu() {
    	this.layersLevel.add(new Button(this.ressources.get(this.frameInformations.getBackground()),300, 400, 200, 100, actions.get(Constants.KEY_START_GAME)), new Integer(Constants.MENU_LEVEL));
    	this.layersLevel.add(new Button(this.ressources.get(this.frameInformations.getBackground()),300, 200, 200, 100, null), new Integer(Constants.MENU_LEVEL));
    }
    
	public void getInformations(String name) {
		HashMap<String,String> informations = new HashMap<String,String>();
		InputStream is=getClass().getResourceAsStream(Constants.DIRECTORY_LEVELS+Constants.FILE_SEPARATOR+name);
		Scanner scanner = new Scanner(is);
		
		for(int i=0;i<Constants.NUMBER_FIELDS_LJ_FILE;i++) {
			informations.put(scanner.nextLine(), scanner.nextLine());
		}
		
		scanner.nextLine();
		String[] levels= new String[Constants.NUMBER_CASE_GAME];
		for(int i=0; scanner.hasNextLine(); i++) {
			levels[i] = scanner.nextLine();
		}
		
		this.frameInformations = new FrameInformations(informations, levels);
		scanner.close();
	}
	
	/**
	 * Reset the frame
	 */
	public void reset() {
		this.layersLevel.removeAll();
	}
	
	/**
	 * Render all the graphic of the frame
	 */
	public void render() {
		this.repaint();
	}
}
