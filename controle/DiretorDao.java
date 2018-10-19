package controle;

import entidades.Usuario;
import interfaces.InterfaceDiretorDao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DiretorDao implements InterfaceDiretorDao {
    @Override
    public Map<String, Usuario> getAll() {
        return new HashMap<>();
    }
}
