package frame;

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
public class Frame implements ActionListener {
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
			InputStream is=getClass().getResourceAsStream(this.frameInformations.getBackground());
			background = new JLabel(new ImageIcon(ImageIO.read(is)));
			background.setLayout(null);
			background.setBounds(0, 0, Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y );
			this.layersLevel.add(background,new Integer(Constants.BACKGROUND_LEVEL));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void setMenu() {
    	this.createButton(this.frameInformations.getBackground(),300, 400, 200, 100 );
    	this.createButton(this.frameInformations.getBackground(),300, 200, 200, 100 );
    }
    
    public void createButton(String path, int x, int y, int dimX, int dimY) {
    	JButton options2 = new JButton();
    	try {
			InputStream is=getClass().getResourceAsStream(path);
    		Image img = ImageIO.read(is);
    		options2.setIcon(new ImageIcon(img));
    		options2.setMargin(new Insets(0, 0, 0, 0));
    		options2.setBorder(null);
    	} catch (Exception ex) {
    		System.out.println(ex);
    	}
    	options2.setBounds(x, y, dimX, dimY);
    	options2.addActionListener(this);
    	this.layersLevel.add(options2, new Integer(Constants.MENU_LEVEL));
    }
    
    public void actionPerformed(ActionEvent e) {
    	System.out.println("test");
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
}
