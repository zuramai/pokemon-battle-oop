package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import pokemon.IPokemon;
import pokemon.Pokemon;
import utils.CLI;
import utils.Color;

public class App {
	private AppConfig config;
	private IPokemon pokemon;
	private IPokemon enemyPokemon;
	private static final String[] types = {"Water", "Fire", "Grass"};
	
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
		CLI.clear();
		System.out.println("Choose your pokemon:");
		System.out.println("1. Grass");
		System.out.println("2. Fire");
		System.out.println("3. Water");
		System.out.print(Color.ANSI_YELLOW + "Your choice: " + Color.ANSI_RESET);
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice == 1) this.pokemon = Pokemon.create("Grass");
		else if(choice == 2) this.pokemon = Pokemon.create("Fire");		
		else this.pokemon = Pokemon.create("Water");		
	}
	
	/**
	 * Show menu and scan the input
	 * @return The choice number
	 */
	public int showAndChooseMenu() {
		System.out.println("==================");
		System.out.printf("Pokemon Game\n");
		System.out.println("==================");
		System.out.println("1. Training");
		System.out.println("2. Heal");
		System.out.println("3. Exit");
		System.out.print(Color.ANSI_YELLOW + "Your choice: " + Color.ANSI_RESET);
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		return choice;
	}
	
	public void training() {
		// Check if the trainer's pokemon HP is zero
		if(this.pokemon.getStats().getHp() == 0) {
			System.out.println(Color.ANSI_RED + "Your pokemon HP is zero. Heal it before you train.");
			return;
		}

		// Random enemy pokemon
		Random r = new Random();
		int randomIndex = r.nextInt(this.types.length);
		this.enemyPokemon = Pokemon.create(this.types[randomIndex]);

		float isPlayerWin = Math.round(Math.random() + 0.3);

		if(isPlayerWin == 0) {
			this.pokemon.getStats().setHp(0);
			System.out.println(Color.ANSI_RED+"Your Lose. Heal your pokemon before training."+Color.ANSI_RESET);
		}else{
			float expGained = Math.round(Math.random() * 10);
			System.out.println(Color.ANSI_GREEN+"You WIN. Gained "+expGained+" Exp!"+Color.ANSI_RESET);

			this.pokemon.getStats().addExp(expGained);
		}
			
	}
	
	public void heal() {
		// check if the trainer's pokemon hp is less than 100
		if(this.pokemon.getStats().getHp() < 100) {
			this.pokemon.getStats().setHp(100);
			System.out.println(Color.ANSI_GREEN+"Congratulations! Your pokemon is healed. Your pokemon HP is 100."+Color.ANSI_RESET);			
		} else {
			System.out.println("Your pokemon HP is still full.");
		}
	}
	
	/**
	 * Exit the application
	 */
	public void exit() {
		System.exit(0);
	}
}
