package controle;

import entidades.Usuario;
import interfaces.InterfaceAlunoDao;

import java.util.HashMap;
import java.util.Map;

public class AlunoDao implements InterfaceAlunoDao {
    @Override
    public Map<String, Usuario> getAll() {
        return new HashMap<>();
    }
}
