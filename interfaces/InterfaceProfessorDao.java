package interfaces;

import entidades.Professor;
import entidades.Usuario;

import java.util.Map;

public interface InterfaceProfessorDao {
    public Map<String, Usuario> getAll();
    public Object add(Professor arg);
}
