package interfaces;

import entidades.Usuario;

import java.util.HashSet;

public interface InterfaceResponsavelDao {
    public HashSet<Usuario> getAll();
}
