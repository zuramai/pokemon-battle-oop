package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	private AppConfig config;
	
	// Colors
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public App(AppConfig config) {
		this.config = config;
	}

	public void start() {
		int choice = this.showAndChooseMenu();
		
	}
	
	public int showAndChooseMenu() {
		System.out.println("==================");
		System.out.printf("\tPokemon Game\n");
		System.out.println("==================");
		System.out.println("1. Training");
		System.out.println("2. Heal");
		System.out.println("3. Exit");
		System.out.print(ANSI_GREEN + "Your choice: " + ANSI_RESET);
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		return choice;
	}
}
