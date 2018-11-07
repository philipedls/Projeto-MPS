package controle;

import entidades.Aluno;
import entidades.Usuario;
import interfaces.InterfaceAlunoDao;

import java.util.HashMap;
import java.util.Map;

public class AlunoDao implements InterfaceAlunoDao {
    @Override
    public Map<String, Usuario> getAll() {
        return new HashMap<>();
    }

    @Override
    public Object add(Aluno arg) {
        return null;
    }
}
