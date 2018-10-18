package fabricas;

import entidades.Turma;

public class FabricaTurma {
    private FabricaTurma() {}

    public static Turma getTurma() {
        return new Turma();
    }
}
