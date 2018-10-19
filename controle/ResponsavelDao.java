package controle;

import entidades.Usuario;
import interfaces.InterfaceResponsavelDao;

import java.util.HashSet;

public class ResponsavelDao implements InterfaceResponsavelDao {
    @Override
    public HashSet<Usuario> getAll() {
        return new HashSet<Usuario>();
    }
}
