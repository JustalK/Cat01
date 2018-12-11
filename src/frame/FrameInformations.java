package frame;

import java.util.HashMap;

import utils.Constants;

public class FrameInformations {
	private String background;
	private String left;
	private String right;
	private String top;
	private String bottom;
	private String[] levels;
	
	public FrameInformations(HashMap<String,String> informations, String[] levels) {
		this.setBackground(informations.get(Constants.KEY_BACKGROUND));
		this.setLeft(informations.get(Constants.KEY_FI_LEFT));
		this.setRight(informations.get(Constants.KEY_FI_RIGHT));
		this.setBottom(informations.get(Constants.KEY_FI_BOTTOM));
		this.setTop(informations.get(Constants.KEY_FI_TOP));
		this.setLevels(levels);
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public String getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(String right) {
		this.right = right;
	}

	/**
	 * @return the bottom
	 */
	public String getBottom() {
		return bottom;
	}

	/**
	 * @param bottom the bottom to set
	 */
	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	/**
	 * @return the level
	 */
	public String[] getLevels() {
		return levels;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevels(String[] levels) {
		this.levels = levels;
	}

	/**
	 * @return the top
	 */
	public String getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(String top) {
		this.top = top;
	}
}
