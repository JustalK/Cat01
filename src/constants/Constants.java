package constants;

public final class Constants {
	public static final String GAME_NAME = "CAT 01";
	public static final int GAME_SIZE_X = 800;
	public static final int GAME_SIZE_Y = 600;
	
	/** System property - <tt>line.separator</tt> */
	public static final String NEW_LINE = System.getProperty("line.separator");
	/** System property - <tt>file.separator</tt> */
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	/** System property - <tt>path.separator</tt> */
	public static final String PATH_SEPARATOR = System.getProperty("path.separator");

	public static final String EMPTY_STRING = "";
	public static final String SPACE = " ";
	public static final String TAB = "\t";
	public static final String SINGLE_QUOTE = "'";
	public static final String PERIOD = ".";
	public static final String DOUBLE_QUOTE = "\"";

	private Constants(){
	    throw new AssertionError();
	}
}
