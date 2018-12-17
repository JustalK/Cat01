package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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
public class Frame {
	private JFrame frame;
	private FrameInformations frameInformations;
	private JLayeredPane layersLevel;
	private JLabel background;
	private HashMap<String,ActionListener> actions;
	private HashMap<String,Image> ressources;
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public Frame(HashMap<String,ActionListener> actions, HashMap<String,Image> ressources) {
    	this.actions = actions;
    	this.ressources = ressources;
    	
        //Create and set up the window.
        frame = new JFrame(Constants.GAME_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        layersLevel = new JLayeredPane();
        frame.add(layersLevel);
        
        frame.setSize(Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y);
        frame.setVisible(true);
    }
    
    /**
     * Show the main menu
     */
    public void showMainMenu() {
    	this.getInformations("levels_0_0.lj");
		this.setBackground();
		this.setMenu();
    }
    
    public void setBackground() {
		background = new JLabel(new ImageIcon(this.ressources.get(this.frameInformations.getBackground())));
		background.setLayout(null);
		background.setBounds(0, 0, Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y );
		this.layersLevel.add(background,new Integer(Constants.BACKGROUND_LEVEL));
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
	
	public void render() {
		this.frame.repaint();

		this.frame.setBackground(new Color(000000));
	}
}
