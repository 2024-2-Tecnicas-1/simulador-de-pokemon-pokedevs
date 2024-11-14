package simulador.aplicacion.pokemones;

import simulador.aplicacion.TipoPokemon;
import simulador.aplicacion.Pokemon;

public class Gastly extends Pokemon {

    public Gastly() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Gastly", 30, 35, new TipoPokemon[] {TipoPokemon.FANTASMA, TipoPokemon.VENENO}, "Normal");
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


