package fabricas;

import entidades.Disciplina;

public class FabricaDisciplina {
    private FabricaDisciplina() {
    }

    public static Disciplina getDisciplina() {
        return new Disciplina();
    }
}
