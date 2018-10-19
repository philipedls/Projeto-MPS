package controle;

import entidades.Usuario;
import interfaces.InterfaceResponsavelDao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ResponsavelDao implements InterfaceResponsavelDao {
    @Override
    public Map<String, Usuario> getAll() {
        return new HashMap<>();
    }
}
