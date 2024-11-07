import simulador.aplicaion.TipoPokemon;
import simulador.aplicaion.Pokemon;
import java.util.LinkedList;

public class Mime extends Pokemon {

    private static final LinkedList<TipoPokemon> tipos = new LinkedList<>();

    static {
        tipos.add(TipoPokemon.PSIQUICO);  
    }

    public Mime() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Mime", 40, 45, tipos, "Normal");
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

