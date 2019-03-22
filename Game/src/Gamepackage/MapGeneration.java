package Gamepackage;

import java.util.*;
import java.io.*;

public class MapGeneration {
	
	
	public static ArrayList<ArrayList> worldmap = new ArrayList<ArrayList>(); //world map
	
	
	public static ArrayList<ArrayList> localMap = new ArrayList<ArrayList>(); //local 10x10 map, initial generation
	public static ArrayList<String> c1 = new ArrayList<String>();
	public static ArrayList<String> c2 = new ArrayList<String>();
	public static ArrayList<String> c3 = new ArrayList<String>();
	public static ArrayList<String> c4 = new ArrayList<String>();
	public static ArrayList<String> c5 = new ArrayList<String>();
	public static ArrayList<String> c6 = new ArrayList<String>();
	public static ArrayList<String> c7 = new ArrayList<String>();
	public static ArrayList<String> c8 = new ArrayList<String>();
	public static ArrayList<String> c9 = new ArrayList<String>();
	public static ArrayList<String> c10 = new ArrayList<String>();
	
	public static boolean singleworldweaponcreation = false; //check for if only one version of single world weapons were generated, if true no more will be created in chunks.
	public int randomeventtriggerrate;// 1/5 chance of random event occurring (add in if statement to signify 1/5)
	public int eventplacementrate; // 1/25 chance of random event occurring (add in if statement to signify 1/25)
	
	
	public static void main(String[] args) {
		localMap.add(c1);
		localMap.add(c2);
		localMap.add(c3);
		localMap.add(c4);
		localMap.add(c5);
		localMap.add(c6);
		localMap.add(c7);
		localMap.add(c8);
		localMap.add(c9);
		localMap.add(c10);
		
		
	}
	
	
	
	public static void initialmapcreation () {
		//Events, Character Home, Random Events
		
		String set = "";
		
		
		for (int i = 0; i < 10; i++) { //double loop for placing random events
			for(int q = 0; q < 10; q++) {
				int magicnumber = (int)(Math.random()*1000)+1;
				
				if (magicnumber == 1 &&  singleworldweaponcreation == false) {
					//once per map random spawn
					set = "Z";
					singleworldweaponcreation = true;
					
				}
				else if(magicnumber > 1 && magicnumber <= 201){
					//chance of random enemy spawning
					//must set to * while also making sure a monster stops there, arraylist to keep monster locations and check per move?
					set = "*";
				}
				else if(magicnumber >= 202 && magicnumber <= 242) {
					//chance of a event is going to be there
					set = "E";
				}
				else {
					set = "*"; //nothing
				}
				
				localMap.get(i).set(q, set);
				
				
			}
		}
		
		localMap.get(5).set(5, "H"); //sets player home
		
		
	}
	
	
	
}
