package simulador.aplicacion;

import java.util.Arrays;
import java.util.LinkedList;

public class Entrenador {

    // TODO: Aquí va tu código
    private final String nombre;
    private final LinkedList<Pokemon> pokemones;
    private final int[] entrenamientosPorPokemon;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new LinkedList<>();
        this.entrenamientosPorPokemon = new int[10];
    }

    public String getNombre() {
        return this.nombre;
    }

    public LinkedList<Pokemon> getPokemones() {
        return this.pokemones;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (pokemones.size() <= 10) {
            pokemones.add(pokemon);
            System.out.println(pokemon.getNombre() + " ha sido agregado al equipo de " + this.nombre);
        } else {
            System.out.println("El equipo está lleno! No se pueden agregar más Pokémones.");
        }
    }

    public void entrenarPokemon(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            int index = pokemones.indexOf(pokemon); 
            entrenamientosPorPokemon[index]++;
            pokemon.setSalud(pokemon.getSalud() + 5);
            pokemon.setPuntosAtaque(pokemon.getPuntosAtaque() + 3);

            System.out.println("\n Entrenamiento de " + pokemon.getNombre() + " con " + this.nombre);
            System.out.println("¡Entrenamiento Número " + entrenamientosPorPokemon[index] + " completado!");
            System.out.println("Salud aumentada en 5 puntos.\n Nueva salud: " + pokemon.getSalud());
            System.out.println("Ataque aumentado en 3 puntos.\n Nuevo ataque: " + pokemon.getPuntosAtaque());
        } else {
            System.out.println("Este Pokémon no pertenece a " + this.nombre);
        }
    }

    public void mostrarPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println(this.nombre + " no tienes ningún Pokémon.");
            return;
        }
        System.out.println("Pokémones de " + this.nombre + ":");
        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon pmostrar = pokemones.get(i);
            System.out.println((i + 1) + ". " + pmostrar.getNombre() + "\n (Salud: " + pmostrar.getSalud()
                    + ", Ataque: " + pmostrar.getPuntosAtaque() + ", Tipo: "
                    + Arrays.toString(pmostrar.getTiposPokemon())
                    + ", Entrenamientos realizados: " + entrenamientosPorPokemon[i] + ")");
        }
    }

    public Pokemon prepararBatalla(int index) {
        if (index >= 0 && index < pokemones.size()) {
            Pokemon pokemonSeleccionado = pokemones.get(index);
            if (pokemonSeleccionado.getSalud() > 0) {
                System.out.println(this.nombre + " ha elegido a " + pokemonSeleccionado.getNombre() + " para la batalla!");
                return pokemonSeleccionado;
            } else {
                System.out.println("Pokémon inválido");
                return null;
            }
        }
        return null;
    }
}
