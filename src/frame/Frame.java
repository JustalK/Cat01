package frame;

import javax.swing.JFrame;

import constants.Constants;

/**
 * The running function
 * @author Justal Kevin
 */
public class Frame {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public Frame() {
        //Create and set up the window.
        JFrame frame = new JFrame(Constants.GAME_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(Constants.GAME_SIZE_X, Constants.GAME_SIZE_Y);
        frame.setVisible(true);
    }
}
