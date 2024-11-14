package simulador.aplicacion.pokemones;

import simulador.aplicacion.Pokemon;
import simulador.aplicacion.TipoPokemon;

public class Electabuzz extends Pokemon {


    public Electabuzz() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Electabuzz", 65, 83, new TipoPokemon[] {TipoPokemon.ELECTRICO}, "Normal");
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
