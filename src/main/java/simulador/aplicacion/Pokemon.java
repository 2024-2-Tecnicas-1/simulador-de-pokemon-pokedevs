package simulador.aplicacion;

public abstract class Pokemon {

    private String nombre;
    private int salud;
    private int puntosAtaque;
    private TipoPokemon [] tipos;
    private String estado;

    // Constructor
    public Pokemon(String nombre, int salud, int puntosAtaque, TipoPokemon [] tipos, String estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.tipos = tipos;
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
        this.salud = this.salud + salud;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public TipoPokemon[] getTiposPokemon() {
        return tipos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos abstractos que deben ser implementados por las subclases
    public abstract int atacar(Pokemon oponente);
    public abstract void recibirDaño(int daño);
    public abstract int entrenar();
}
