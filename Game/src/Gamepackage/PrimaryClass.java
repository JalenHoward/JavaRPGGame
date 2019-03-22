package Gamepackage;

import java.io.*;
import java.util.*;

public class PrimaryClass {

	public static boolean resumingsavegame = false; //if true, lets game know you are resuming from a save game, allows loading of previous save.
	public static void main(String[] args) {
		Scanner load = new Scanner(System.in);
		saveCheck();
		//insert loading mod packs or such at a later date
		
		
		
		
	}
	public static void saveCheck() {
		Scanner load = new Scanner(System.in);
		
		File savegame = new File("...\\RPG\\saves\\save.rpg ");
		if (savegame.exists() == true && !savegame.isDirectory()) {
			
			System.out.println("Saved games found, would you like to load a game?");
			String select = load.nextLine();
			
			if (select.equals("1")) {
				loadSave(1);
			}
			else if (select.equals("2")) {
				loadSave(2);
			}
			else if (select.equals("3")) {
				loadSave(3);
			}
			else if (select.equals("4")) {
				loadSave(4);
			}
			else {
				newGame();
			}
			
		}
		else {
			System.out.println("No save game found, start a new one?");
			String select = load.nextLine();
			select.compareTo("y");
			if (select.equals("y")) {
				newGame(); //new game if they enter yes
			}
			else {
				System.exit(0); //program exists if anything is entered other that y
			}
			
		}
		
		
		
	}
	
	public static void loadSave(int saveslot) {
		
		
	}
	
	public static void newGame() {
		
	}
	
	public static String importLevels(String levelstring) {
		
		return levelstring;
		
	}
	
	

}
