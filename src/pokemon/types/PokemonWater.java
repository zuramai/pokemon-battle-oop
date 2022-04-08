package pokemon.types;

import pokemon.IPokemon;
import pokemon.Pokemon;
import pokemon.PokemonStats;

public class PokemonWater extends Pokemon implements IPokemon {
	public PokemonWater(PokemonStats stats) {
		// Set Pokemon Fire default stats
		if(stats == null)
			stats = new PokemonStats(120, 0, 5, 15, 22);
		
		this.setStats(stats);
	}
	
	@Override
	public void attack() {
		System.out.println("Pokemon Water Attack!");
	}
}
