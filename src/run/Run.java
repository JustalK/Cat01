package run;
import game.Game;

/**
 * The running function
 * @author Justal Kevin
 */
public final class Run {

    public static void main(String[] args) {
    	Game game = new Game();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //game.loop();
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                game.loop();
            }
        }).start();
    }
}