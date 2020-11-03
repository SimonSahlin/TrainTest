package com.traintest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Travelers {
	Ticket ticket = new Ticket();
	Passanger passanger = new Passanger ("", "", 0, "");
	ArrayList <Passanger> passangerList = new ArrayList <Passanger>();
	
	public void runnerMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vad är ditt förnamn?");
		passanger.setFirstName(scanner.nextLine());
		System.out.println("Och ditt efternamn, tack!");
		passanger.setLastName(scanner.nextLine());
		System.out.println("Välkommen ombord " + passanger.getFirstName() + " " + passanger.getLastName() + ". Hur gammal är du?");
		passanger.setAge(scanner.nextInt());
		
		if (passanger.getAge() < 18 || passanger.getAge() > 65) {
			System.out.println("Du får åka för ett rabatterat pris.\nTryck 1. För en enkelbiljett som kostar " + ticket.getDiscountSingle() + " kr.\nTryck 2. För en månadsbiljett som kostar " + ticket.getDiscountMonth() + " kr.");
			int choice = scanner.nextInt();
			do {
			switch (choice) {
			case 1: 
				System.out.println("Du har valt att köpa en enkelbiljett, du får åka denna resan sen måste du köpa en ny biljett. Vänligen betala " + ticket.getDiscountSingle() + " kr.");
				System.out.println("Tack för det. Ha en trevlig åktur.");
				passanger.setPayed("Betalt: enkelbiljett");
				addPassanger(passanger);
				break;
			case 2: 
				System.out.println("Du har valt att köpa en månadsbiljett, du får åka denna resan sen måste du köpa en ny biljett. Vänligen betala " + ticket.getDiscountMonth() + " kr.");
				System.out.println("Tack för det. Ha en trevlig åktur.");
				passanger.setPayed("Betalt: månadsbiljett");
				addPassanger(passanger);	
				break;
			default: 
				System.out.println("Tråkigt val. Testa 1 eller 2.");
			}
			} while (!(choice == 1 || choice == 2));
			
		} else {
			System.out.println("Tryck 1. För en engångsbiljett som kostar " + ticket.getNormalSingle() + " kr.\n Tryck 2. För en månadsbiljett som kostar " + ticket.getNormalMonth() + " kr.");
			int choice = scanner.nextInt();
			do {
				switch (choice) {
				case 1: 
					System.out.println("Du har valt att köpa en enkelbiljett, du får åka denna resan sen måste du köpa en ny biljett. Vänligen betala " + ticket.getDiscountSingle() + " kr.");
					System.out.println("Tack för det. Ha en trevlig åktur.");
					passanger.setPayed("Betalt: enkelbiljett");
					addPassanger(passanger);
					break;
				case 2: 
					System.out.println("Du har valt att köpa en månadsbiljett, du får åka denna resan sen måste du köpa en ny biljett. Vänligen betala " + ticket.getDiscountMonth() + " kr.");
					System.out.println("Tack för det. Ha en trevlig åktur.");
					passanger.setPayed("Betalt: månadsbiljett");
					addPassanger(passanger);
					break;
/*Kan ta bort*/default: 
					System.out.println("Tråkigt val. Testa 1 eller 2.");
					choice = scanner.nextInt();
				}
				} while (!(choice == 1 || choice == 2));
		}
		for(int i = 0; i < passangerList.size(); i++) {
			System.out.println(passangerList);
		}
		
		Menu menu = new Menu();
		menu.mainMenu();
		
	}
	
	public void addPassanger(Passanger passanger) {
		passangerList.add(new Passanger(passanger.getFirstName(), passanger.getLastName(), passanger.getAge(), passanger.getPayed()));
	}
	
	public void showPassangerList() {
		
		if (passangerList.isEmpty()) {
		System.out.println("Inga passagerare registrerade.");
		} 
		
		for(int i = 0; i < passangerList.size(); i++) {
		}
			Menu menu = new Menu();
			menu.mainMenu();
	}

	
}
