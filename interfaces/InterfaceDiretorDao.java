package interfaces;

import entidades.Usuario;

import java.util.HashSet;

public interface InterfaceDiretorDao {
    public HashSet<Usuario> getAll();
}
