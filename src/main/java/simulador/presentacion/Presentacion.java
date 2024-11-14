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

    public static void mensajeDarPrimerPokemon(){
        Entrenador entrenador;
        String nombre;
        System.out.print("Pero primero dime como te llamas: ");
        nombre = scanner.nextLine();
        entrenador = new Entrenador(nombre);

        System.out.println("¡Bien! ¡Tu nombre es "+ entrenador.getNombre());

        Pokemon primero = primerPokemon();

        System.out.println(entrenador.getNombre()+" toma te doy tu primer pokemon, el es "+ primero.getNombre());
        entrenador.agregarPokemon(primero);
    }

    public static void main(String[] args) {
        Presentacion presentacion = new Presentacion();
        System.out.println(presentacion.mensajeInicio());
        mensajeDarPrimerPokemon();

    }
}
