package controle;

import entidades.Usuario;

public class Login {
    private EstrategiaLogin el;

    public Login(EstrategiaLogin el) {
        this.el = el;
    }

    public boolean logar(Usuario u) {
        return this.el.logar(u);
    }
}
