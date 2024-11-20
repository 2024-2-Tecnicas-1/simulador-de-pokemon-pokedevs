package Persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persistencia{
    private static final String DIRECTORIO_PARTIDAS = "datos/partidas/";

    // Asegura que el directorio existe
    static {
        new File(DIRECTORIO_PARTIDAS).mkdirs();
    }

    // Guarda una partida individual
    public static void guardarPartida(Serializable partida, String nombrePartida) {
        File archivo = new File(DIRECTORIO_PARTIDAS + nombrePartida + ".dat");
        try (FileOutputStream fileOut = new FileOutputStream(archivo);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(partida);
            System.out.println("Partida guardada exitosamente en: " + archivo.getPath());
        } catch (IOException e) {
            System.err.println("Error al guardar la partida: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Lee una partida individual
    public static Object cargarPartida(String nombrePartida) {
        File archivo = new File(DIRECTORIO_PARTIDAS + nombrePartida + ".dat");
        if (!archivo.exists()) {
            System.out.println("No existe una partida guardada con el nombre: " + nombrePartida);
            return null;
        }

        try (FileInputStream fileIn = new FileInputStream(archivo);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Object partida = in.readObject();
            System.out.println("Partida cargada exitosamente: " + nombrePartida);
            return partida;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la partida: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Lista todas las partidas guardadas
    public static List<String> listarPartidas() {
        File directorio = new File(DIRECTORIO_PARTIDAS);
        List<String> partidas = new ArrayList<>();
        
        File[] archivos = directorio.listFiles((dir, name) -> name.endsWith(".dat"));
        if (archivos != null) {
            for (File archivo : archivos) {
                // Elimina la extensión .dat del nombre
                String nombrePartida = archivo.getName().replace(".dat", "");
                partidas.add(nombrePartida);
            }
        }
        return partidas;
    }

    // Elimina una partida guardada
    public static boolean eliminarPartida(String nombrePartida) {
        File archivo = new File(DIRECTORIO_PARTIDAS + nombrePartida + ".dat");
        if (archivo.exists()) {
            boolean eliminado = archivo.delete();
            if (eliminado) {
                System.out.println("Partida eliminada exitosamente: " + nombrePartida);
            } else {
                System.out.println("No se pudo eliminar la partida: " + nombrePartida);
            }
            return eliminado;
        }
        System.out.println("No existe una partida con el nombre: " + nombrePartida);
        return false;
    }
}