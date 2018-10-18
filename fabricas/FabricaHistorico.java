package fabricas;

import entidades.Historico;

public class FabricaHistorico {
    private FabricaHistorico() {}

    public static Historico getHistorico() {
        return new Historico();
    }
}
