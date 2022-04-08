package pokemon;

import pokemon.types.PokemonFire;
import pokemon.types.PokemonWater;

public class Pokemon implements IPokemon {
	private Stats stats;
	private String type;

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void attack() {
		System.out.println("Attack!");
	}
	
	/**
	 * Pokemon factory builder
	 * @param type Type of the pokemon
	 * @return The pokemon
	 */
	public static IPokemon create(String type) {
		if(type.equals("Fire")) return new PokemonFire();
		else return new PokemonWater();
	}	
	
	/**
	 * Method overloading	
	 * @param type
	 * @param stats
	 * @return
	 */
	public static IPokemon create(String type, Stats stats) {
		if(type.equals("Fire")) return new PokemonFire();
		else return new PokemonWater();
	}
	
	
}
