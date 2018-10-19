package controle;

import entidades.Usuario;
import interfaces.InterfaceProfessorDao;

import java.util.HashSet;

public class ProfessorDao implements InterfaceProfessorDao {

    @Override
    public HashSet<Usuario> getAll() {
        return new HashSet<Usuario>();
    }
}
