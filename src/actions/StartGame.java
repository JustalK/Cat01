package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.Settings;

public class StartGame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Settings.setStartGame(true);
		Settings.setShowMainMenu(false);
		System.out.println("hahaha");
	}

}
