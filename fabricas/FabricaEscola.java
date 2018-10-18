package fabricas;

import entidades.Escola;

public class FabricaEscola {
    private FabricaEscola() {}

    public static Escola getEscola() {
        return new Escola();
    }
}
