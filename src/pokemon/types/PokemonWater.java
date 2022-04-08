package pokemon.types;

import pokemon.IPokemon;
import pokemon.Pokemon;

public class PokemonWater extends Pokemon implements IPokemon {
	@Override
	public void attack() {
		System.out.println("Pokemon Water Attack!");
	}
}
