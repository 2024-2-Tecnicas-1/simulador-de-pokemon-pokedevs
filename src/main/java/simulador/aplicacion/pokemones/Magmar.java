package simulador.aplicacion.pokemones;

import simulador.aplicacion.TipoPokemon;
import simulador.aplicacion.Pokemon;

public class Magmar extends Pokemon {

    public Magmar() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Magmar", 65, 95, new TipoPokemon[]{TipoPokemon.FUEGO}, "Normal");
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