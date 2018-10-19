package controle;

import entidades.Usuario;
import interfaces.InterfaceDiretorDao;

import java.util.HashSet;

public class DiretorDao implements InterfaceDiretorDao {
    @Override
    public HashSet<Usuario> getAll() {
        return new HashSet<Usuario>();
    }
}
