package game;

public class Settings {
	private static boolean showMainMenu = true;
	private static boolean startGame = false;

	public static boolean getShowMainMenu() {
		return showMainMenu;
	}

	public static void setShowMainMenu(boolean showMainMenu) {
		Settings.showMainMenu = showMainMenu;
	}

	public static boolean isStartGame() {
		return startGame;
	}

	public static void setStartGame(boolean startGame) {
		Settings.startGame = startGame;
	}
}
