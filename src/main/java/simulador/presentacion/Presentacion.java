package simulador.presentacion;

public class Presentacion {

    public String mensajeInicio(){
        String mensaje1 = "Hola a todos! ¡Bienvenidos al mundo de POKÉMON!\n"+
                "¡Me llamo OAK!\n"+"¡Pero la gente me llama el PROFESOR POKÉMON!\n"+
                "¡Este mundo está habitado por unas criaturas llamadas POKÉMON! Para algunos, los POKÉMON son mascotas. Pero otros los usan para pelear.";
        return mensaje1;
    }

    public static void main(String[] args) {
        Presentacion presentacion = new Presentacion();
        System.out.println(presentacion.mensajeInicio());
    }
}
