package simulador.aplicacion.pokemones;

import simulador.aplicacion.TipoPokemon;
import simulador.aplicacion.Pokemon;

public class Tentacool extends Pokemon {

    public Tentacool() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Tentacool", 40, 40, new TipoPokemon[] {TipoPokemon.VENENO, TipoPokemon.AGUA}, "Normal");
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