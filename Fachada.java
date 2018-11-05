import controle.Comando;
import entidades.AdicionaAlunoComando;

import java.util.HashMap;

public class Fachada {
    private HashMap<String, Comando> cmds;

    public Fachada() {
        cmds = new HashMap<>();
        initComandos();
    }

    private void initComandos() {
        this.cmds.put("AdicionaAluno", new AdicionaAlunoComando());
    }
}
