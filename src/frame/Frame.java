package frame;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
	private JLayeredPane layersLevel;
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
    public void showMenu() {
    	/**
		try {
			JLabel myImage = new JLabel(new ImageIcon(ImageIO.read(new File("assets/backgrounds/test.jpg"))));
			myImage.setLayout(null);
			myImage.setBounds(0, 0, 800, 600 );
			layers.add(myImage,2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    	JPanel panel = new JPanel();
    	JButton button = new JButton("test");
    	panel.setLayout(null);
    	button.setLayout(null);
    	button.setBounds(300, 200, 200, 100 );
    	layers.add(button, 4);
    	layers.add(panel, 2);
    	**/
    }
}
