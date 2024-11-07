import simulador.aplicaion.TipoPokemon;
import simulador.aplicaion.Pokemon;
import java.util.LinkedList;

public class Magmar extends Pokemon {

    private static final LinkedList<TipoPokemon> tipos = new LinkedList<>();
    
    static {
        tipos.add(TipoPokemon.FUEGO);  
    }

    public Magmar() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Magmar", 65, 95, tipos, "Normal");
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