package pokemon.types;

import pokemon.IPokemon;
import pokemon.Pokemon;

public class PokemonFire extends Pokemon implements IPokemon {
	
	@Override
	public void attack() {
		System.out.println("Pokemon Fire Attack!");
	}
}
