package simulador.aplicacion.pokemones;

import simulador.aplicacion.TipoPokemon;
import simulador.aplicacion.Pokemon;

public class Jynx extends Pokemon {

    public Jynx() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Jynx", 65, 50, new TipoPokemon[] {TipoPokemon.HIELO, TipoPokemon.PSIQUICO}, "Normal");
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

