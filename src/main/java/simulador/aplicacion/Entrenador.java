package simulador.aplicacion;

import java.util.Arrays;
import java.util.LinkedList;

public class Entrenador {

    private final String nombre;
    private final LinkedList<Pokemon> pokemones;
    private final int[] entrenamientosPorPokemon; // Contador de entrenamientos por Pokémon

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new LinkedList<>();
        this.entrenamientosPorPokemon = new int[10]; // Máximo 10 Pokémon
    }

    public String getNombre() {
        return this.nombre;
    }

    public LinkedList<Pokemon> getPokemones() {
        return this.pokemones;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (pokemones.size() < 10) {
            pokemones.add(pokemon);
            System.out.println(pokemon.getNombre() + " ha sido agregado al equipo de " + this.nombre);
        } else {
            System.out.println("El equipo está lleno. No se pueden agregar más Pokémon.");
        }
    }

    public void entrenarPokemon(Pokemon pokemon) {
        int index = pokemones.indexOf(pokemon);

        if (index == -1) {
            System.out.println("Este Pokémon no pertenece a " + this.nombre + ".");
            return;
        }

        if (entrenamientosPorPokemon[index] >= 3) {
            System.out.println(pokemon.getNombre() + " ya ha sido entrenado 3 veces hoy. No puede entrenar más.");
            return;
        }

        // Realizar entrenamiento
        pokemon.setSalud(pokemon.getSalud() + 5);
        pokemon.setPuntosAtaque(pokemon.getPuntosAtaque() + 3);
        entrenamientosPorPokemon[index]++;

        // Mostrar resultados del entrenamiento
        System.out.println("\nEntrenamiento de " + pokemon.getNombre() + " completado.");
        System.out.println("Salud aumentada en 5 puntos. Nueva salud: " + pokemon.getSalud());
        System.out.println("Ataque aumentado en 3 puntos. Nuevo ataque: " + pokemon.getPuntosAtaque());
        System.out.println("Entrenamientos de hoy: " + entrenamientosPorPokemon[index] + "/3.");
    }

    public void mostrarPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println(this.nombre + " no tiene ningún Pokémon.");
            return;
        }

        System.out.println("Pokémones de " + this.nombre + ":");
        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon p = pokemones.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + 
                " (Salud: " + p.getSalud() + 
                ", Ataque: " + p.getPuntosAtaque() + 
                ", Tipo: " + Arrays.toString(p.getTiposPokemon()) + 
                ", Entrenamientos de hoy: " + entrenamientosPorPokemon[i] + "/3)");
        }
    }

    public void reiniciarEntrenamientos() {
        Arrays.fill(entrenamientosPorPokemon, 0);
        System.out.println("Los entrenamientos diarios han sido reiniciados. ¡Nuevo día, nuevas oportunidades para entrenar!");
    }

    public Pokemon prepararBatalla(int index) {
        if (index >= 0 && index < pokemones.size()) {
            Pokemon pokemonSeleccionado = pokemones.get(index);
            if (pokemonSeleccionado.getSalud() > 0) {
                System.out.println(this.nombre + " ha elegido a " + pokemonSeleccionado.getNombre() + " para la batalla.");
                return pokemonSeleccionado;
            } else {
                System.out.println("El Pokémon seleccionado no tiene suficiente salud para pelear.");
            }
        } else {
            System.out.println("Selección inválida.");
        }
        return null;
    }
}
