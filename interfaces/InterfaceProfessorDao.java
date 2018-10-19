package interfaces;

import entidades.Usuario;

import java.util.HashSet;

public interface InterfaceProfessorDao {
    public HashSet<Usuario> getAll();
}
