import app.App;
import app.AppConfig;

public class Main {

	public static void main(String[] args) {
		// Configuration for the app
		Integer[] levelsExpThresold = {10,20,30,40,50,60,70,80,90,100};
		int maxPokemonObtained = 3;
		
		// Create AppConfig instance and pass it to App.		
		AppConfig config = new AppConfig(levelsExpThresold, maxPokemonObtained);
		App app = new App(config);
		
		// Start the application!
		app.start();
	}

}
