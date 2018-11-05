package interfaces;

import entidades.Aluno;
import entidades.Usuario;
import java.util.Map;

public interface InterfaceAlunoDao {
    public Map<String, Usuario> getAll();

    Object add(Aluno arg);
}
