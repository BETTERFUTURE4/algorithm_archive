import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private HashMap<String,ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;

        // 해당하는 ArrayList가 없으면 생성
        if (getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        if (getPokemons(name) == null) {
            return null;
        }

        Pokemon strongestPokemon = null;
        int maxCp = 0;

        for (Pokemon p : getPokemons(name)) {
            if (strongestPokemon == null || p.cp > maxCp) {
                strongestPokemon = p;
                maxCp = p.cp;
            }
        }
        return strongestPokemon;

    }

    public Pokemon getStrongest() {
        Pokemon strongestPokemon = new Pokemon("",0);
        int maxCp = 0;
        for (String key : pokemons.keySet()) {
            Pokemon maxP = getStrongest(key);
            if (maxP.cp > maxCp) {
                strongestPokemon = getStrongest(key);
                maxCp = getStrongest(key).cp;
            }
        }
        return strongestPokemon;
    }
}