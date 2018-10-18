package fabricas;

import entidades.Professor;

public class FabricaProfessor {
    private FabricaProfessor() {}

    public static Professor getProfessor() {
        return new Professor();
    }
}
