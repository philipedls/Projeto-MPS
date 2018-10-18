package fabricas;

import entidades.Aluno;

public class FabricaAluno {

    private FabricaAluno() {}

    public static Aluno getAluno() {
        return new Aluno();
    }
}
