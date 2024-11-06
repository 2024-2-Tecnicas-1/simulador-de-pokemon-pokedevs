package simulador.aplicaion;

import java.util.LinkedList;

public abstract class Pokemon {
    // TODO: Aquí va tu código
    private String nombre;
    private int salud;
    private int puntosAtaque;
    private LinkedList<TipoPokemon> tiposPokemon;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosAtaque, TipoPokemon tipoPokemon, String estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.tiposPokemon = new LinkedList<>();
        this.estado = estado;
    }

    //Metodos Getters y Setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPuntosAtaque() {
        return this.puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public LinkedList<TipoPokemon> getTiposPokemon() {
        return this.tiposPokemon;
    }

    public void setTiposPokemon(LinkedList<TipoPokemon> tiposPokemon) {
        this.tiposPokemon = tiposPokemon;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodos abstracts

    abstract int atacar(Pokemon oponente);

    abstract int recibirDaño(int daño);

    abstract int entrenar();
}
