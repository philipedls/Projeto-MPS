package fabricas;

import entidades.Diretor;

public class FabricaDiretor {
    private FabricaDiretor() {}

    public Diretor getDiretor() {
        return new Diretor();
    }
}
