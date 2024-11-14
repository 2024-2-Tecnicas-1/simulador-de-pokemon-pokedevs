package simulador.aplicacion.pokemones;

import simulador.aplicacion.Pokemon;
import simulador.aplicacion.TipoPokemon;

public class MrMine extends Pokemon {
    public MrMine() {
        super("Mr Mine", 40, 45, new TipoPokemon[]{TipoPokemon.PSIQUICO, TipoPokemon.HADA}, "Normal");
    }

    @Override
    public int atacar(Pokemon oponente) {
        return 0;
    }

    @Override
    public int entrenar() {
        return 0;
    }

    @Override
    public int recibirDaño(int daño) {
        return 0;
    }
}
