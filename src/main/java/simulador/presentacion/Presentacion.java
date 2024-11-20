package simulador.presentacion;

import simulador.aplicacion.Entrenador;
import simulador.aplicacion.Pokemon;
import simulador.aplicacion.pokemones.*;

import java.util.Random;
import java.util.Scanner;

public class Presentacion {

    static Scanner scanner = new Scanner(System.in);

    public static Pokemon primerPokemon(){
        Random random = new Random();

        Pokemon pokemones []= new Pokemon[10];
        pokemones[0]= new Aerodactyl();
        pokemones[1]= new Electabuzz();
        pokemones[2]= new Gastly();
        pokemones[3]= new Jynx();
        pokemones[4]= new Magmar();
        pokemones[5]= new MrMine();
        pokemones[6]= new Sandshrew();
        pokemones[7]= new Seel();
        pokemones[8]= new Tangela();
        pokemones[9]=new Tentacool();

        int posicionAlazar = random.nextInt(10);

        return pokemones[posicionAlazar];
    }

    public String mensajeInicio(){
        String mensaje1 = "Hola a todos! ¡Bienvenidos al mundo de POKÉMON!\n"+
                "¡Me llamo OAK!\n"+"¡Pero la gente me llama el PROFESOR POKÉMON!\n"+
                "¡Este mundo está habitado por unas criaturas llamadas POKÉMON! Para algunos, los POKÉMON son mascotas. Pero otros los usan para pelear.";
        return mensaje1;
    }

    public static Entrenador crearEntrenadorConPrimerPokemon(){
        Entrenador entrenador;
        String nombre;
        System.out.print("Pero primero dime como te llamas: ");
        nombre = scanner.nextLine();
        entrenador = new Entrenador(nombre);

        System.out.println("¡Bien! ¡Tu nombre es "+ entrenador.getNombre());

        Pokemon primero = primerPokemon();

        System.out.println(entrenador.getNombre()+" toma te doy tu primer pokemon, el es "+ primero.getNombre());
        entrenador.agregarPokemon(primero);
        return entrenador;
    }

     public static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Entrenar Pokémon");
        System.out.println("2. Añadir Pokémon");
        System.out.println("3. Guardar partida");
        System.out.println("4. Iniciar batalla");
        System.out.println("5. Salir");
    }
    
    public static void main(String[] args) {
        Presentacion presentacion = new Presentacion();
        System.out.println(presentacion.mensajeInicio());
        Entrenador entrenador = crearEntrenadorConPrimerPokemon();
        
        
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:  // Entrenar Pokémon
                    entrenador.mostrarPokemones();
                    System.out.print("Elige un Pokémon para entrenar: ");
                    int pokemonIndex = scanner.nextInt() - 1;  // Restamos 1 porque el índice empieza desde 0
                    if (pokemonIndex >= 0 && pokemonIndex < entrenador.getPokemones().size()) {
                        Pokemon pokemon = entrenador.getPokemones().get(pokemonIndex);
                        entrenador.entrenarPokemon(pokemon);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 2:  // Guardar partida
                    Pokemon [] pokemones = {new Aerodactyl(), new Electabuzz(), new Gastly(), new Jynx(), new Magmar(), new MrMine(), new Sandshrew(), new Seel(), new Tangela(), new Tentacool()};
                    break;
                case 3:  // Guardar partida
                    System.out.println("La partida ha sido guardada exitosamente.");// Añadir la lista de pokemones
                    break;
                case 4:  // Iniciar batalla
                    
                    
                    
                    break;
                case 5:  // Salir
                    continuar = false;  // Termina el bucle y sale del juego
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }
}