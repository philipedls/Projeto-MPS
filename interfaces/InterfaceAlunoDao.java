package interfaces;

import entidades.Usuario;

import java.util.HashSet;

public interface InterfaceAlunoDao {
    public HashSet<Usuario> getAll();

}
