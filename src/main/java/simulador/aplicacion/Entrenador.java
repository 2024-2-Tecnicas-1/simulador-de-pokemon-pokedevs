package simulador.aplicacion;

import java.util.LinkedList;

public class Entrenador {

    // TODO: Aquí va tu código
    private final String nombre;
    private final LinkedList<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new LinkedList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (pokemones.size() < 6) {
            pokemones.add(pokemon);
            System.out.println(pokemon.getNombre() + " ha sido agregado al equipo de " + this.nombre);
        } else {
            System.out.println("El equipo está lleno! No se pueden agregar más Pokémones.");
        }
    }

    public void entrenarPokemon(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            pokemon.entrenar();

        } else {
            System.out.println("Este Pokémon no pertenece a " + this.nombre);
        }
    }

    public void mostrarPokemones() {
        System.out.println("Pokémones de " + this.nombre + ":");
        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon pmostrar = pokemones.get(i);
            System.out.println((i + 1) + ". " + pmostrar.getNombre()
                    + " (Salud: " + pmostrar.getSalud()
                    + ", Ataque: " + pmostrar.getPuntosAtaque()
                    + ", Tipo: " + pmostrar.getTiposPokemon() + ")");
        }
    }

    public Pokemon prepararBatalla(int index) {
        if (index >= 0 && index < pokemones.size()) {
            return pokemones.get(index);
        }
        return null;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LinkedList<Pokemon> getPokemones() {
        return pokemones;
    }
}
