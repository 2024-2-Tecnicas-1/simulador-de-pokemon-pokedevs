package simulador.aplicacion;

import java.util.Random;

import java.util.Scanner;

import simulador.aplicacion.pokemones.Aerodactyl;
import simulador.aplicacion.pokemones.Electabuzz;
import simulador.aplicacion.pokemones.Gastly;
import simulador.aplicacion.pokemones.Jynx;
import simulador.aplicacion.pokemones.Magmar;
import simulador.aplicacion.pokemones.MrMine;
import simulador.aplicacion.pokemones.Sandshrew;
import simulador.aplicacion.pokemones.Seel;
import simulador.aplicacion.pokemones.Tangela;
import simulador.aplicacion.pokemones.Tentacool;

public class Batalla {

    private int batallasPerdidas = 0;
    private Pokemon entrenado;
    private Pokemon salvaje;

<<<<<<< HEAD
public Batalla(Pokemon entrenado) {
=======
    public Batalla(Pokemon entrenado, Pokemon salvaje) {

    }

    public Batalla(Pokemon entrenado) {
>>>>>>> c852ae445cac7704706c253c1f08a60b784e4b6f

        this.entrenado = entrenado;
        this.salvaje = pokemonSalvaje();
    }

    public static Pokemon pokemonSalvaje() {
        Random random = new Random();

        Pokemon pokemones[] = new Pokemon[10];
        pokemones[0] = new Aerodactyl();
        pokemones[1] = new Electabuzz();
        pokemones[2] = new Gastly();
        pokemones[3] = new Jynx();
        pokemones[4] = new Magmar();
        pokemones[5] = new MrMine();
        pokemones[6] = new Sandshrew();
        pokemones[7] = new Seel();
        pokemones[8] = new Tangela();
        pokemones[9] = new Tentacool();

        int posicionAlazar = random.nextInt(10);

        return pokemones[posicionAlazar];
    }

    public void iniciarBatalla() {
        int nose = salvaje.getSalud();
        System.out.println("¡Comienza la batalla!");
        System.out.println(entrenado.getNombre() + " (Salud: " + entrenado.getSalud() + ") vs "
                + salvaje.getNombre() + " (Salud: " + salvaje.getSalud() + ")");

        while (entrenado.getSalud() > 0 && salvaje.getSalud() > 0) {
            turno(entrenado, salvaje);
            if (salvaje.getSalud() <= 0) {
                System.out.println(salvaje.getNombre() + " ha sido derrotado.");
                System.out.println(entrenado.getNombre() + " es el ganador.");
                mejorarSalvaje();
                
                break;
            }

            turno(salvaje, entrenado);
            if (entrenado.getSalud() <= 0) {
                System.out.println(entrenado.getNombre() + " ha sido derrotado.");
                System.out.println(salvaje.getNombre() + " es el ganador.");
                break;
            }
        }
    }

    public Batalla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void iniciarBatalla(Scanner scanner) {
        System.out.println("\n¡Comienza la batalla!");
        System.out.println("================================");
        System.out.println("Tu Pokémon: " + entrenado.getNombre() + " (Salud: " + entrenado.getSalud() + ")");
        System.out.println("Pokémon salvaje: " + salvaje.getNombre() + " (Salud: " + salvaje.getSalud() + ")");
        System.out.println("================================\n");

        while (entrenado.getSalud() > 0 && salvaje.getSalud() > 0) {
            // Turno del jugador
            System.out.println("\nTu turno - Presiona 'A' y Enter para atacar:");
            String entrada = scanner.nextLine().toUpperCase();

            if (entrada.equals("A")) {
                turno(entrenado, salvaje);
                if (salvaje.getSalud() <= 0) {
                    System.out.println("\n¡" + salvaje.getNombre() + " ha sido derrotado!");
                    System.out.println("¡" + entrenado.getNombre() + " es el ganador!");
                    mejorarSalvaje();
                    break;
                }

                // Pausa antes del turno del Pokémon salvaje
                System.out.println("\nPresiona Enter para continuar...");
                scanner.nextLine();

                // Turno del Pokémon salvaje
                System.out.println("\n¡Turno de " + salvaje.getNombre() + "!");
                turno(salvaje, entrenado);
                if (entrenado.getSalud() <= 0) {
                    System.out.println("\n¡" + entrenado.getNombre() + " ha sido derrotado!");
                    System.out.println("¡" + salvaje.getNombre() + " es el ganador!");
                    batallasPerdidas++;
                    break;
                }

                // Mostrar estado actual después de cada ronda
                mostrarEstadoBatalla();
            } else {
                System.out.println("¡Comando no válido! Presiona 'A' para atacar.");
            }
        }
    }

    private void mostrarEstadoBatalla() {
        System.out.println("\n=== Estado de la batalla ===");
        System.out.println(entrenado.getNombre() + " - Salud: " + entrenado.getSalud());
        System.out.println(salvaje.getNombre() + " - Salud: " + salvaje.getSalud());
        System.out.println("===========================");
    }

    private void turno(Pokemon atacante, Pokemon defensor) {
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre());

        // Calcular daño según el multiplicador por tipo
        TipoPokemon tipoAtacante = atacante.getTiposPokemon()[0];
        TipoPokemon tipoDefensor = defensor.getTiposPokemon()[0];
        double multiplicador = tipoAtacante.multiplicadorDaño(tipoAtacante, tipoDefensor);

        int daño = (int) (atacante.getPuntosAtaque() * multiplicador);
        System.out.println("El ataque inflige " + daño + " puntos de daño.");

        // Aplicar daño al defensor
        int saludRestante = defensor.getSalud() - daño;
        defensor.setSalud(Math.max(saludRestante, 0));
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getSalud() + " puntos de salud.");
    }

    private void mejorarSalvaje() {
        System.out.println("¡El Pokémon salvaje mejora para el próximo encuentro!");
        Random random = new Random();

        // Aumentar salud según el estado del salvaje
        int incremento = switch (salvaje.getEstado()) {
            case "Débil" ->
                random.nextInt(2) + 1; // Incremento de 1-2
            case "Normal" ->
                random.nextInt(3) + 2; // Incremento de 2-4
            case "Fuerte" ->
                random.nextInt(5) + 3; // Incremento de 3-7
            default ->
                0; // Sin incremento en caso de estado no definido
        };

        salvaje.setSalud(salvaje.getSalud() + incremento);
        System.out.println("La salud de " + salvaje.getNombre() + " aumenta en " + incremento
                + " y ahora es de " + salvaje.getSalud());
    }

}

<<<<<<< HEAD

=======
>>>>>>> c852ae445cac7704706c253c1f08a60b784e4b6f
