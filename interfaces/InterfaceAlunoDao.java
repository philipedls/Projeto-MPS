package interfaces;

import entidades.Usuario;
import java.util.Map;

public interface InterfaceAlunoDao {
    public Map<String, Usuario> getAll();

}
