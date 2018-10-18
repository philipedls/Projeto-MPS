package fabricas;

import entidades.Usuario;

public class FabricaUsuario {
    private FabricaUsuario() {}

    public static Usuario getUsuario() {
        return new Usuario();
    }
}
