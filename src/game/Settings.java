package game;

public class Settings {
	private static boolean startConsole = true;
	private static boolean showMainMenu = true;
	private static boolean startGame = false;
	private static boolean inGame = false;
	private static boolean closeGame = false;

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
}
