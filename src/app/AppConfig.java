package app;


public class AppConfig {
	private Integer[] expThresold;
	private int maxPokemonObtained;
	
	public AppConfig(Integer[] expThresold, int maxPokemonObtained) {
		this.maxPokemonObtained = maxPokemonObtained;
		this.expThresold = expThresold;
	}

	public Integer[] getExpThresold() {
		return this.expThresold;
	}
}
