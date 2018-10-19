package interfaces;

import entidades.Usuario;
import java.util.Map;

public interface InterfaceDiretorDao {
    public Map<String, Usuario> getAll();
}
