package game;

public class Settings {
	private static boolean showMainMenu = true;

	public static boolean getShowMainMenu() {
		return showMainMenu;
	}

	public static void setShowMainMenu(boolean showMainMenu) {
		Settings.showMainMenu = showMainMenu;
	}
}
