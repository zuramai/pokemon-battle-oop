package app;

import java.util.ArrayList;
import java.util.Scanner;

import pokemon.IPokemon;
import pokemon.Pokemon;
import utils.Color;

public class App {
	private AppConfig config;
	private IPokemon pokemon;
	
	
	public App(AppConfig config) {
		this.config = config;
	}

	/**
	 * Start the application
	 */
	public void start() {
		// Before the application starts, the trainer choose a pokemon first.
		this.choosePokemon();
		
		int choice;
		
		do {
			choice = this.showAndChooseMenu();
			if(choice == 1) training();
			else if(choice == 2) heal();
		} while(choice != 3);
			
		System.out.println("Thank you for playing Pokemon!");
		return;
	}
	
	/**
	 * Choose pokemon for the trainer
	 */
	public void choosePokemon() {
		System.out.println("Choose your pokemon:");
		System.out.println("1. Grass");
		System.out.println("2. Fire");
		System.out.println("3. Water");
		System.out.print(Color.ANSI_GREEN + "Your choice: " + Color.ANSI_RESET);
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice == 1) this.pokemon = Pokemon.create("Grass");
		else if(choice == 2) this.pokemon = Pokemon.create("Fire");		
		else if(choice == 3) this.pokemon = Pokemon.create("Water");		
	}
	
	/**
	 * Show menu and scan the input
	 * @return The choice number
	 */
	public int showAndChooseMenu() {
		System.out.println("==================");
		System.out.printf("\tPokemon Game\n");
		System.out.println("==================");
		System.out.println("1. Training");
		System.out.println("2. Heal");
		System.out.println("3. Exit");
		System.out.print(Color.ANSI_GREEN + "Your choice: " + Color.ANSI_RESET);
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		return choice;
	}
	
	public void training() {
		
	}
	
	public void heal() {
		
	}
	
	public void exit() {
		
	}
}
