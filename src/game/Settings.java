package game;

public class Settings {
	private static boolean startConsole = true;
	private static boolean showMainMenu = true;
	private static boolean startGame = false;
	private static boolean inGame = false;
	private static boolean closeGame = false;
	private static boolean left = false;
	private static boolean right = false;

	public static boolean getShowMainMenu() {
		return showMainMenu;
	}

	public static void setShowMainMenu(boolean showMainMenu) {
		Settings.showMainMenu = showMainMenu;
	}

	public static boolean getStartGame() {
		return startGame;
	}

	public static void setStartGame(boolean startGame) {
		Settings.startGame = startGame;
	}

	public static boolean getStartConsole() {
		return startConsole;
	}

	public static void setStartConsole(boolean startConsole) {
		Settings.startConsole = startConsole;
	}

	public static boolean getCloseGame() {
		return closeGame;
	}

	public static void setCloseGame(boolean closeGame) {
		Settings.closeGame = closeGame;
	}

	public static boolean getInGame() {
		return inGame;
	}

	public static void setInGame(boolean inGame) {
		Settings.inGame = inGame;
	}

	public static boolean getLeft() {
		return left;
	}

	public static void setLeft(boolean left) {
		Settings.left = left;
	}

	public static boolean getRight() {
		return right;
	}

	public static void setRight(boolean right) {
		Settings.right = right;
	}
}
