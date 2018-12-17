package frame;

import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton {
	private static final long serialVersionUID = 1L;

	public Button(Image img, int x, int y, int dimX, int dimY,ActionListener action) {
		try {
    		this.setIcon(new ImageIcon(img));
    		this.setMargin(new Insets(0, 0, 0, 0));
    		this.setBorder(null);
    	} catch (Exception ex) {
    		System.out.println(ex);
    	}
    	this.setBounds(x, y, dimX, dimY);
    	this.addActionListener(action);
	}
}
