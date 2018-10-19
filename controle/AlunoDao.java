package controle;

import entidades.Usuario;
import interfaces.InterfaceAlunoDao;

import java.util.HashSet;

public class AlunoDao implements InterfaceAlunoDao {
    @Override
    public HashSet<Usuario> getAll() {
        return new HashSet<Usuario>();
    }
}
