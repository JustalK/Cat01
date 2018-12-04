package frame;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public Frame() {
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
		try {
			background = new JLabel(new ImageIcon(ImageIO.read(new File(this.frameInformations.getBackground()))));
			background.setLayout(null);
			background.setBounds(0, 0, Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y );
			this.layersLevel.add(background,new Integer(Constants.BACKGROUND_LEVEL));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void setMenu() {
    	JButton options2 = new JButton("test 2");
    	JButton options1 = new JButton("test");
    	options2.setBounds(400, 400, 200, 100 );
    	options1.setBounds(300, 200, 100, 100 );
    	this.layersLevel.add(options2, new Integer(Constants.MENU_LEVEL));
    	this.layersLevel.add(options1, new Integer(Constants.MENU_LEVEL));
    }
    
	public void getInformations(String name) {
		try {
			HashMap<String,String> informations = new HashMap<String,String>();
			Scanner scanner = new Scanner(new File(Constants.DIRECTORY_LEVELS+Constants.FILE_SEPARATOR+name));
			
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
