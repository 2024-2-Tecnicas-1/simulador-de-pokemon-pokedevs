package simulador.aplicacion.pokemones;

import simulador.aplicacion.Pokemon;
import simulador.aplicacion.TipoPokemon;

public class Aerodactyl extends Pokemon {


    public Aerodactyl() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Aerodactyl", 80, 105, new TipoPokemon[]{TipoPokemon.ROCA, TipoPokemon.VOLADOR}, "Normal");
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
        System.out.println(getNombre() + " atacó a " + oponente.getNombre() + " causando " + dañoTotal +
                " puntos de daño (multiplicador: " + multiplicador + ").");

        return dañoTotal;
        
    }

    @Override
    public void recibirDaño(int daño) {
        setSalud(daño);
    }

    @Override
    public int entrenar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


