package interfaces;

import entidades.Usuario;
import java.util.Map;

public interface InterfaceResponsavelDao {
    public Map<String, Usuario> getAll();
}
