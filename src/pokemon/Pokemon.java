package pokemon;

import pokemon.types.PokemonFire;
import pokemon.types.PokemonGrass;
import pokemon.types.PokemonWater;

public class Pokemon implements IPokemon {
	private String name;
	private String type;
	private PokemonStats stats;
	

	public void attack() {
		System.out.println("Attack!");
	}
	
	/**
	 * Pokemon factory builder
	 * @param type Type of the pokemon
	 * @return The pokemon
	 */
	public static IPokemon create(String type) {
		if(type.equals("Fire")) return new PokemonFire((PokemonStats)null);
		if(type.equals("Grass")) return new PokemonGrass((PokemonStats)null);
		else return new PokemonWater((PokemonStats)null);
	}	
	
	/**
	 * Method overloading: create pokemon instance with custom stats	
	 * @param type
	 * @param stats
	 * @return Pokemon instance with interface
	 */
	public static IPokemon create(String type, PokemonStats stats) {
		IPokemon pokemon;
		if(type.equals("Fire")) pokemon = new PokemonFire(stats);
		if(type.equals("Grass")) pokemon = new PokemonGrass(stats);
		else pokemon = new PokemonWater(stats);
		
		return pokemon;
	}

	public PokemonStats getStats() {
		return stats;
	}

	public void setStats(PokemonStats stats) {
		this.stats = stats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
