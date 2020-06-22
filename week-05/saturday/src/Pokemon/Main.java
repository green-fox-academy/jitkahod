package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        for (Pokemon p:pokemonOfAsh) {
            if (p.isEffectiveAgainst(wildPokemon)){

                System.out.print("I choose you, "+ p.name);
                break;
            }
        }

        //System.out.print("I choose you, ");
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}
// Every pokemon has a name and a type.
// Certain types are effective against others, e.g. water is effective against fire.

// Ash has a few pokemon.
// A wild pokemon appeared!
// Which pokemon should Ash use?