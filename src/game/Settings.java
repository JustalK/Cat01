package game;

public class Settings {
	private static boolean showMenu = true;

	public static boolean getShowMenu() {
		return showMenu;
	}

	public static void setShowMenu(boolean showMenu) {
		Settings.showMenu = showMenu;
	}
}
