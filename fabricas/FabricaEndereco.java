package fabricas;

import entidades.Endereco;

public class FabricaEndereco {
    private FabricaEndereco() {}

    public static Endereco getEndereco() {
        return new Endereco();
    }
}
