package com.traintest;

import java.util.Scanner;

public class Menu {
	
	public void mainMenu() {
		Travelers travelers = new Travelers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------Menu---------");
		System.out.println("Välj ett av följande val:\n1. Registrera ny passagerare.\n2.Se lista över passagerare.\n3. Avsluta programemt.");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: 
			travelers.runnerMethod();
			break; 
		case 2: 
			travelers.showPassangerList();
			mainMenu();
			break; 
		}
	}
	
	
}
