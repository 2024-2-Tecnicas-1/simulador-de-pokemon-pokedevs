package simulador.aplicaion;

import java.util.LinkedList;

public abstract class Pokemon {
    // TODO: Aquí va tu código
    private String nombre;
    private int salud;
    private int puntosAtaque;
    private LinkedList<TipoPokemon> tiposPokemon;
    private String estado;

    // Constructor
    public Pokemon(String nombre, int salud, int puntosAtaque, LinkedList<TipoPokemon> tiposPokemon, String estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.tiposPokemon = tiposPokemon;
        this.estado = estado;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public LinkedList<TipoPokemon> getTiposPokemon() {
        return tiposPokemon;
    }

    public void setTiposPokemon(LinkedList<TipoPokemon> tiposPokemon) {
        this.tiposPokemon = tiposPokemon;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos abstractos que deben ser implementados por las subclases
    public abstract int atacar(Pokemon oponente);
    public abstract int recibirDaño(int daño);
    public abstract int entrenar();
}
