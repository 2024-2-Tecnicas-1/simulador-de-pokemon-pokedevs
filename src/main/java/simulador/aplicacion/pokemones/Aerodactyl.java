package simulador.aplicacion.pokemones;

import simulador.aplicacion.Pokemon;
import simulador.aplicacion.TipoPokemon;

public class Aerodactyl extends Pokemon {


    public Aerodactyl() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("simulador.aplicaion.Aerodactyl", 80, 105, new TipoPokemon[]{TipoPokemon.ROCA, TipoPokemon.VOLADOR}, "Normal");
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


