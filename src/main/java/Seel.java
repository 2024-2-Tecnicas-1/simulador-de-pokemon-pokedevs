import simulador.aplicaion.TipoPokemon;
import simulador.aplicaion.Pokemon;
import java.util.LinkedList;

public class Seel extends Pokemon {

    private static final LinkedList<TipoPokemon> tipos = new LinkedList<>();

    static {
        tipos.add(TipoPokemon.AGUA);  
    }

    public Seel() {
        // Llamar al constructor de Pokemon con la lista de tipos
        super("Seel", 65, 45, tipos, "Normal");
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