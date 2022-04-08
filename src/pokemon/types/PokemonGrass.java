package pokemon.types;

import pokemon.IPokemon;
import pokemon.Pokemon;
import pokemon.PokemonStats;

public class PokemonGrass extends Pokemon implements IPokemon {
	public PokemonGrass(PokemonStats stats) {
		// Set Pokemon Fire default stats
		if(stats == null)
			stats = new PokemonStats(200, 0, 30, 5, 2);
		
		this.setStats(stats);
	}

	@Override
	public void attack() {
		System.out.println("Pokemon Grass Attack!");
	}
}

