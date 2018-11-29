package run;
import frame.Frame;

/**
 * The running function
 * @author Justal Kevin
 */
public final class Run {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Frame();
            }
        });
    }
}