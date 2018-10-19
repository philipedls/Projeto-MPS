package interfaces;

import entidades.Usuario;
import java.util.Map;

public interface InterfaceProfessorDao {
    public Map<String, Usuario> getAll();
}
