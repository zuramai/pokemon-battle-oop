package pokemon.types;

import pokemon.IPokemon;
import pokemon.Pokemon;
import pokemon.PokemonStats;

public class PokemonFire extends Pokemon implements IPokemon {
	public PokemonFire(PokemonStats stats) {
		// Set Pokemon Fire default stats
		if(stats == null)
			stats = new PokemonStats(100, 0, 10, 10, 10);
		
		this.setStats(stats);
	}

	@Override
	public void attack() {
		System.out.println("Pokemon Fire Attack!");
	}
}
