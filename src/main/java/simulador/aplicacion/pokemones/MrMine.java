package simulador.aplicacion.pokemones;

import simulador.aplicacion.Pokemon;
import simulador.aplicacion.TipoPokemon;

public class MrMine extends Pokemon {

    public MrMine() {
        super("Mr Mine", 40, 45, new TipoPokemon[]{TipoPokemon.PSIQUICO, TipoPokemon.HADA}, "Normal");
    }

    @Override
    public int atacar(Pokemon oponente) {
        TipoPokemon[] tiposAtacante = getTiposPokemon();
        TipoPokemon[] tiposDefensor = oponente.getTiposPokemon();
        double multiplicador = 1.0;

        // Calcular el multiplicador de daño
        for (TipoPokemon tipoAtacante : tiposAtacante) {
            for (TipoPokemon tipoDefensor : tiposDefensor) {
                multiplicador *= tipoAtacante.multiplicadorDaño(tipoAtacante, tipoDefensor);
            }
        }

        // Calcular daño total
        int dañoBase = getPuntosAtaque();
        int dañoTotal = (int) (dañoBase * multiplicador);

        // Aplicar el daño al oponente
        oponente.recibirDaño(dañoTotal);

        // Mostrar información del ataque
        System.out.println(getNombre() + " atacó a " + oponente.getNombre() + " causando " + dañoTotal
                + " puntos de daño (multiplicador: " + multiplicador + ").");

        return dañoTotal;
    }

    @Override
    public int entrenar() {
        return 0;
    }

    @Override
    public void recibirDaño(int daño) {
        int nuevaSalud = getSalud() - daño;
        if (nuevaSalud < 0) {
            nuevaSalud = 0; // La salud no puede ser negativa
        }
        setSalud(nuevaSalud);

        System.out.println(getNombre() + " recibió " + daño + " puntos de daño. Salud restante: " + getSalud());

    }
}
