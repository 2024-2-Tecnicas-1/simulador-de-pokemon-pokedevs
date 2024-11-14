package simulador.aplicacion.pokemones;

import simulador.aplicacion.TipoPokemon;
import simulador.aplicacion.Pokemon;

public class Sandshrew extends Pokemon {

    public Sandshrew() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Sandshrew", 65, 83, new TipoPokemon[] {TipoPokemon.TIERRA}, "Normal");
    }

    @Override
    public int atacar(Pokemon oponente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recibirDaño(int daño) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int entrenar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
