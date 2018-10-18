package fabricas;

import entidades.Responsavel;

public class FabricaResponsavel {
    private FabricaResponsavel() {}

    public static Responsavel getResponsavel() {
        return new Responsavel();
    }
}
